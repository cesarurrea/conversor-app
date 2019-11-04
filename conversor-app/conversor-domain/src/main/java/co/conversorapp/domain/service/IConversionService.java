package co.conversorapp.domain.service;

import java.util.List;

import co.conversorapp.domain.model.ConversionModel;

public interface IConversionService {

	String convertirArabigoARomano(Integer arabigo);

	List<ConversionModel> getAllConversions();

	ConversionModel create(ConversionModel model);

}
