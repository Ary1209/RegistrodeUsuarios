package com.proyecto.demo.credencial;

import java.util.ArrayList;
import java.util.List;

import com.proyecto.demo.aceceso.AccesoEntity;
import com.proyecto.demo.usuario.UsuarioEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credencial")
public class CredencialEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_credencial", unique = true, nullable = false)
	private Long id;

	@Column(name = "numerocredncial", nullable = false)
	private Integer numerocrdencial;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_usuario", referencedColumnName="id_usuario")
	private UsuarioEntity usuario;
	
	@OneToMany(mappedBy = "credencial", cascade = CascadeType.ALL, orphanRemoval = true )
	private List<AccesoEntity> accesos = new ArrayList<>();
}
