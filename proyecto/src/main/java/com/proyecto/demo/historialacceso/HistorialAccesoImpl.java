package com.proyecto.demo.historialacceso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.usuario.UsuarioEntity;

@Service
public class HistorialAccesoImpl implements HistorialAccesoService {
	
	@Autowired
	private HistorialAccesoRepository historialAccesoRepository;
	
	@Override
	public HistorialAccesoEntity registroDeHistorialAcceso(HistorialAccesoEntity historial) {
		return historialAccesoRepository.save(historial);  
	}

	@Override
	public HistorialAccesoEntity actualizacionDeHistorialAcceso(HistorialAccesoEntity historial) {
		if(historial.getId()!=null)
		return historialAccesoRepository.save(historial) ;
		else {
			throw new IllegalArgumentException("se debe de agregar el a id");
		}
	}

	@Override
	public List<HistorialAccesoEntity> visualizacionDeHistorialAcceso() {
		return historialAccesoRepository.findAll();
	}

	@Override
	public void eliminacionDeHistorialAcceso(Long id) {
		historialAccesoRepository.deleteById(id);
		
	}
	

}
