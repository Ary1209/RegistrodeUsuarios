package com.proyecto.demo.aceceso;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AccesoRepository extends JpaRepository<AccesoEntity, Long> {

}
