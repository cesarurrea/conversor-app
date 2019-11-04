package co.conversorapp.infrastructure.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.conversorapp.domain.model.ConversionModel;
import co.conversorapp.domain.repository.IConversionRepository;
import co.conversorapp.infrastructure.entity.Conversion;
import co.conversorapp.infrastructure.mapper.Mapper;

@Component
public class ConversionRepository implements IConversionRepository {

	@Autowired
	private IConversionDao dao;

	@Override
	public List<ConversionModel> getAllConversions() {

		return dao.findAll().stream().map(c -> Mapper.ConversionMapper.map(c)).collect(Collectors.toList());

	}

	@Override
	public ConversionModel create(ConversionModel model) {

		Conversion entity = Mapper.ConversionMapper.map(model);

		entity = dao.save(entity);

		if (entity == null) {
			model.setOperationStatus("Error: No se almaceno la conversion en Base de datos");
		} else {
			model.setOperationStatus("Exito: La conversion se ha creado en Base de datos");
		}

		return model;
	}

}
