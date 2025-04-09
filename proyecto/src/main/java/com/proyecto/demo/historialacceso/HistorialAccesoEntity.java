package com.proyecto.demo.historialacceso;

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
@Table(name = "historialAcceso")

public class HistorialAccesoEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historialacceso", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "historialacceso", nullable = false)
	private Integer historialacceso;
	
	@OneToMany(mappedBy = "historialacceso", cascade =CascadeType.ALL, orphanRemoval = true)
	private List<HistorialAccesoEntity>accesos =new  ArrayList<>();
}
