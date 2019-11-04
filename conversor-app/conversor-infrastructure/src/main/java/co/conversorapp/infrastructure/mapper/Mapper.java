package co.conversorapp.infrastructure.mapper;

import co.conversorapp.domain.model.ConversionModel;
import co.conversorapp.infrastructure.entity.Conversion;

public class Mapper {

	public static class ConversionMapper {
		public static Conversion map(ConversionModel conversionModel) {

			Conversion entity = new Conversion(conversionModel.getId(), conversionModel.getFechaHora(),
					conversionModel.getArabigo(), conversionModel.getRomano(), conversionModel.getOperationStatus());

			return entity;

		}

		public static ConversionModel map(Conversion conversion) {

			ConversionModel model = new ConversionModel(conversion.getId(), conversion.getFechaHora(),
					conversion.getArabigo(), conversion.getRomano(), conversion.getOperationStatus());

			return model;

		}

	}

}
