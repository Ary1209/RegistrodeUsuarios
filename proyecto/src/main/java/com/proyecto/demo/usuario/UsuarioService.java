package com.proyecto.demo.usuario;

import java.util.List;

public interface UsuarioService {

	UsuarioEntity registroDeUsuarios (UsuarioEntity usuario);
	
	UsuarioEntity actualizacionDeUsuario (UsuarioEntity usuario);
	
	List<UsuarioEntity> visualizacionDeUsuarios ();
	
	void eliminacionDeUsuarios(Long Id);
}
