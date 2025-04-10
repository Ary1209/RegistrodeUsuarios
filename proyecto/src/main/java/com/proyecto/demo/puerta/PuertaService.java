package com.proyecto.demo.puerta;

import java.util.List;

public interface PuertaService {
	
	PuertaEntity registroDePuerta (PuertaEntity puerta);
	
	PuertaEntity actualizacionDePuerta (PuertaEntity puerta);
	
	List<PuertaEntity> visualizacionDePuerta();
	
	void eliminacionDePuerta(Long Id);

}
