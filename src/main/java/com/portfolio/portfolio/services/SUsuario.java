package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Proyecto;
import com.portfolio.portfolio.entitys.Usuario;
import com.portfolio.portfolio.repositorys.RUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SUsuario {
    @Autowired
    RUsuario usuarioRepo;

    public List<Usuario> list(){
        return usuarioRepo.findAll();
    }

    public Usuario getUser(Long id){
        Usuario user = usuarioRepo.findById(id).orElse(null);
        return user;
    }
    public void save(Usuario user){
        usuarioRepo.save(user);
    }
    public void delete(Long id){
        usuarioRepo.deleteById(id);
    }
    public void edit(Usuario user){
        usuarioRepo.save(user);
    }
}
