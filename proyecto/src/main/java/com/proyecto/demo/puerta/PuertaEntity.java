package com.proyecto.demo.puerta;

import java.util.ArrayList;
import java.util.List;

import com.proyecto.demo.aceceso.AccesoEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "puerta")
public class PuertaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_puerta", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "puerta", nullable = false)
	private String puerta;
	
	@Column(name = "ubicacion", nullable = false)
	private String ubicacion;
	
	@OneToMany(mappedBy = "puerta", cascade =CascadeType.ALL, orphanRemoval = true)
	private List<AccesoEntity>accesos =new  ArrayList<>();
}
