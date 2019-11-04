package co.conversorapp.domain.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.conversorapp.domain.exceptions.ConversionException;
import co.conversorapp.domain.model.ConversionModel;
import co.conversorapp.domain.repository.IConversionRepository;
import co.conversorapp.domain.service.IConversionService;
import co.conversorapp.domain.service.IConversor;

@Service
public class ConversionServiceImpl implements IConversionService {

	@Autowired
	private IConversionRepository repository;

	@Autowired
	private IConversor conversor;

	@Override
	public List<ConversionModel> getAllConversions() {
		return repository.getAllConversions();
	}

	@Override
	public ConversionModel create(ConversionModel model) {

		return repository.create(model);
	}

	@Override
	public String convertirArabigoARomano(Integer arabigo) {

		ConversionModel model = new ConversionModel(UUID.randomUUID().toString(), new Date(), arabigo, "", "");
		String romano = "";

		try {
			romano = conversor.arabigosARomanos(arabigo);
			model.setRomano(romano);
			model.setOperationStatus("Conversion Exitosa");
		} catch (ConversionException e) {
			romano = e.getMessage();
			model.setOperationStatus(romano);
		}

		repository.create(model);

		return romano;
	}

}
