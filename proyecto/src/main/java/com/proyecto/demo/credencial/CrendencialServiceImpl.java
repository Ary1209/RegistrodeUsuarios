package com.proyecto.demo.credencial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrendencialServiceImpl  implements CredencialService{

	@Autowired
	private CredencialRepository credencialRepository;
	
	@Override
	public CredencialEntity registroDeCredencial(CredencialEntity credencial) {
		
		return credencialRepository.save(credencial);
	}

	@Override
	public CredencialEntity actualizacionDeCredencial(CredencialEntity credencial) {
		if (credencial.getId()!= null) {
			return credencialRepository.save(credencial);
		}else {
			throw new IllegalArgumentException("se debe de agregar el a id");
		}
	}

	@Override
	public List<CredencialEntity> visualizacionDeCredencial() {
		return credencialRepository.findAll();
		
	}

	@Override
	public void eliminacionDeCredencial(Long id) {
		credencialRepository.deleteById(id);
		
	}

}
