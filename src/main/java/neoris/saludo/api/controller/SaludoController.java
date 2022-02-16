package neoris.saludo.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import neoris.saludo.api.entity.Saludo;
import neoris.saludo.api.response.SaludoResponse;
import neoris.saludo.api.service.SaludoService;

@RestController
@RequestMapping("/api/saludo/")
public class SaludoController {

	@Autowired
	private SaludoService saludoService;
	
	@GetMapping("/findAll")
	public List<Saludo> getAll(){
		return saludoService.allSaludos();
	}
	@GetMapping("/findByType/{tipo_saludo}")
	public Saludo getByType(@PathVariable String tipo_saludo){
		return saludoService.byTypeSaludos(tipo_saludo);
	}
	
	@PostMapping("/create")
	public Saludo create(@RequestBody Saludo saludo) {
		return saludoService.createSaludo(saludo);
	}

	
	
	
	
	
	
	
	
	

	
}
