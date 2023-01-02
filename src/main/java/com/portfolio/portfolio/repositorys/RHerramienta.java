package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.Herramienta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHerramienta extends JpaRepository<Herramienta, Long> {
}
