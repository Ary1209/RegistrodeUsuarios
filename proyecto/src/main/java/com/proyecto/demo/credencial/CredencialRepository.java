package com.proyecto.demo.credencial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredencialRepository extends JpaRepository<CredencialEntity, Long> {

}
