package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RContacto extends JpaRepository<Contacto, Long> {
}
