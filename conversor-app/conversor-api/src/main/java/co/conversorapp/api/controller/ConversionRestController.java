package co.conversorapp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.conversorapp.domain.model.ConversionModel;
import co.conversorapp.domain.service.IConversionService;

@RestController
@RequestMapping("/conversor")
public class ConversionRestController {

	@Autowired
	private IConversionService service;

	@GetMapping("convertir")
	public String convertir(@RequestParam int arabigo) {
		return service.convertirArabigoARomano(arabigo);

	}

	@GetMapping(value = "/ListarConversiones")
	public List<ConversionModel> getAllConversions() {
		return service.getAllConversions();
	}

	@PostMapping("/create")
	public ConversionModel create(@RequestBody ConversionModel model) {
		return service.create(model);

	}

}
