package neoris.saludo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neoris.saludo.api.entity.Saludo;
import neoris.saludo.api.repository.SaludoRepository;

@Service
public class SaludoService {
	
	@Autowired 
	private SaludoRepository saludoRepo;
	
	public List<Saludo> allSaludos(){
		return saludoRepo.findAll();
	}
	
	public Saludo byTypeSaludos(String tipo_saludo){
		return saludoRepo.getByTipo_saludo(tipo_saludo);
	}
	
	public Saludo createSaludo(Saludo saludo){
		return saludoRepo.save(saludo);
	}
	

}
