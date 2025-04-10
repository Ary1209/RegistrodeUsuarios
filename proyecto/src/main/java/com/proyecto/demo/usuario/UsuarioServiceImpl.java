package com.proyecto.demo.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
    private UsuarioRepository usuarioRepository;
	
	@Override
	public UsuarioEntity registroDeUsuarios(UsuarioEntity usuario) {
		return usuarioRepository.save(usuario);
	}

	public UsuarioEntity actualizacionDeUsuario(UsuarioEntity usuario) {
		if (usuario.getId()!= null) {
			return usuarioRepository.save(usuario);
		}else {
			throw new IllegalArgumentException("se debe de agregar el a id");
		}
		
	}

	@Override
	public List<UsuarioEntity> visualizacionDeUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public void eliminacionDeUsuarios(Long id) {
		usuarioRepository.deleteById(id);
		
	}

	
	
}
