package com.proyecto.demo.puerta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuertaRepository extends JpaRepository<PuertaEntity, Long> {

}
