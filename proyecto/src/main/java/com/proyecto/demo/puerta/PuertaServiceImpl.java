package com.proyecto.demo.puerta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PuertaServiceImpl  implements PuertaService {
	
	@Autowired
	private PuertaRepository puertaRepository;

	@Override
	public PuertaEntity registroDePuerta(PuertaEntity puerta) {
		return puertaRepository.save(puerta);  
	}

	@Override
	public PuertaEntity actualizacionDePuerta(PuertaEntity puerta) {
		if(puerta.getId()!=null)
			return puertaRepository.save(puerta) ;
			else {
				throw new IllegalArgumentException("se debe de agregar el a id");
			}
	}

	@Override
	public List<PuertaEntity> visualizacionDePuerta() {
		return puertaRepository.findAll();
	}

	@Override
	public void eliminacionDePuerta(Long id) {
		puertaRepository.deleteById(id);
		
	}

}
