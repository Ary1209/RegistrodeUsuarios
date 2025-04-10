package com.proyecto.demo.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.puerta.PuertaEntity;
import com.proyecto.demo.puerta.PuertaRepository;
import com.proyecto.demo.puerta.PuertaService;
@Service
public class PuertaServiceImpl  implements PuertaService{

	@Autowired
	private PuertaRepository puertaRepository;
	
	@Override
	public PuertaEntity registroDePuerta(PuertaEntity puerta) {
		return puertaRepository.save(puerta);
	}

	@Override
	public PuertaEntity actualizacionDePuerta(PuertaEntity puerta) {
		if (puerta.getId()!=null) {
			return puertaRepository.save(puerta);
		}else {
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
