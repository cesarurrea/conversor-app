package org.conversorapp.api;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import co.conversorapp.ConversorAppApplication;

/**
 * Tests de Integración
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConversorAppApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppIntegrationTest {

	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	/**
	 * Test de Integración para probar el servicio Rest de Conversión
	 */

	@Test
	public void probarServicioRestConversion() {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/conversor-app/conversor/convertir?arabigo=1360"), HttpMethod.GET, entity,
				String.class);

		assertThat(response.getBody()).isEqualTo("MCCCLX");

	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
