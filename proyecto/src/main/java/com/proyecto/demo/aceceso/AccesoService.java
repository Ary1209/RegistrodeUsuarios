package com.proyecto.demo.aceceso;

import java.util.List;

public interface AccesoService {

	AccesoEntity registroDeAcceso (AccesoEntity acceso);
	
	AccesoEntity actualizacionDeAcceso (AccesoEntity acceso);
	
	List<AccesoEntity> visualizacionDeAcceso();
	
	void eliminacionDeAccesos(Long Id);
}
