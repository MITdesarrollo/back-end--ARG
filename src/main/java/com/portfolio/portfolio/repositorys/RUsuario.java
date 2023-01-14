package com.portfolio.portfolio.repositorys;

import com.portfolio.portfolio.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario extends JpaRepository<Usuario, Long> {
}
