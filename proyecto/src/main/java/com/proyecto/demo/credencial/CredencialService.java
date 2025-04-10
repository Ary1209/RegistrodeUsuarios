package com.proyecto.demo.credencial;

import java.util.List;

public interface CredencialService {

	CredencialEntity registroDeCredencial(CredencialEntity credencial);
	
	CredencialEntity actualizacionDeCredencial(CredencialEntity credencial);
	
	List<CredencialEntity> visualizacionDeCredencial();
	
	void eliminacionDeCredencial(Long Id);
	
}
