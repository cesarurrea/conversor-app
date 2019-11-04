package co.conversorapp.domain.service;

import co.conversorapp.domain.exceptions.ConversionException;

public interface IConversor {
	public String arabigosARomanos(int arabigo) throws ConversionException;
}
