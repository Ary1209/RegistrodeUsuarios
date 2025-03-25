package com.proyecto.demo.aceceso;

import com.proyecto.demo.credencial.CredencialEntity;
import com.proyecto.demo.puerta.PuertaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "acceso")

public class AccesoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acceso", unique = true, nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_credencial")
	private CredencialEntity credencial;
	
	@ManyToOne
	@JoinColumn(name = "id_puerta")
	private PuertaEntity puerta;
}
