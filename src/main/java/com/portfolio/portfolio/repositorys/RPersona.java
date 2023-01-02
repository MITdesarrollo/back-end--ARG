package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long> {
}
