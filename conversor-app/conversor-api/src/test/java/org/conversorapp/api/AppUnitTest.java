package org.conversorapp.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import co.conversorapp.domain.exceptions.ConversionException;
import co.conversorapp.domain.service.IConversor;
import co.conversorapp.domain.service.impl.Conversor;

/**
 * Pruebas Unitarias
 */
@RunWith(SpringRunner.class)
public class AppUnitTest {

	@Autowired
	private IConversor conversor;

	@TestConfiguration
	static class TestUnitConfiguration {

		@Bean
		public Conversor conversor() {
			return new Conversor();
		}
	}
	
	/**
	 * Test Unitario para prueba del Componente conversor.
	 */
	@Test
	public void testConversion() {

		String romano;

		try {
			romano = conversor.arabigosARomanos(1360);

			assertThat(romano).isEqualTo("MCCCLX");
			
		} catch (ConversionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
