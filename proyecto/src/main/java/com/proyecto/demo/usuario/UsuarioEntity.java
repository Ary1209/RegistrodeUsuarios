package com.proyecto.demo.usuario;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "usuario")
public class UsuarioEntity {

	//es un id unico	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", unique = true, nullable = false)
	private Long id;

	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="direccion",nullable=false)
	private String direccion;
	
	@Column(name="apellido",nullable=false)
	private String apellido;
	
	@Column(name="edad",nullable=false)
	private Integer edad;
	
	
}
