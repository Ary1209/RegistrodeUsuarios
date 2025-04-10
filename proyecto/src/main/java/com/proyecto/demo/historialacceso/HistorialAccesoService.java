package com.proyecto.demo.historialacceso;

import java.util.List;

public interface HistorialAccesoService {

	HistorialAccesoEntity registroDeHistorialAcceso(HistorialAccesoEntity historial);

	HistorialAccesoEntity actualizacionDeHistorialAcceso(HistorialAccesoEntity historia);
	
	List<HistorialAccesoEntity> visualizacionDeHistorialAcceso();
	
	void eliminacionDeHistorialAcceso(Long Id);

	
}
