package co.conversorapp.domain.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import co.conversorapp.domain.enums.NumeroRomano;
import co.conversorapp.domain.exceptions.ConversionException;
import co.conversorapp.domain.service.IConversor;

@Component
public class Conversor implements IConversor {

	@Override
	public String arabigosARomanos(int arabigo) throws ConversionException {
		if ((arabigo <= 0) || (arabigo > 4000)) {
			throw new ConversionException(
					"Error: [" + arabigo + "] el Conversor solo acepta numeros dentro del siguiente Rango (0,4000]");
		}

		List<NumeroRomano> listaNumerosRomanos = NumeroRomano.getValoresInvertidos();

		int i = 0;
		StringBuilder sb = new StringBuilder();

		while ((arabigo > 0) && (i < listaNumerosRomanos.size())) {
			NumeroRomano simboloActual = listaNumerosRomanos.get(i);
			if (simboloActual.getValor() <= arabigo) {
				sb.append(simboloActual.name());
				arabigo -= simboloActual.getValor();
			} else {
				i++;
			}
		}

		return sb.toString();
	}

}
