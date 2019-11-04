package co.conversorapp.domain.repository;

import java.util.List;

import co.conversorapp.domain.model.ConversionModel;

public interface IConversionRepository {
	List<ConversionModel> getAllConversions();

	ConversionModel create(ConversionModel model);
}
