package com.proyecto.demo.aceceso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccesoserviceImpl implements AccesoService{

	@Autowired
	private AccesoRepository accesoRepository;
	
	@Override
	public AccesoEntity registroDeAcceso(AccesoEntity acceso) {
		return accesoRepository.save(acceso);
	}

	@Override
	public AccesoEntity actualizacionDeAcceso(AccesoEntity acceso) {
		if (acceso.getId()!= null) {
			return accesoRepository.save(acceso);
		}else {
			throw new IllegalArgumentException("se debe de agregar el a id");
		}
	}

	@Override
	public List<AccesoEntity> visualizacionDeAcceso() {
		return accesoRepository.findAll();
	}

	@Override
	public void eliminacionDeAccesos(Long id) {
		accesoRepository.deleteById(id);
		
	}
	
	

}
