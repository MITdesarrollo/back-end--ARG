package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Long> {
}
