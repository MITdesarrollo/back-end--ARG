package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Proyecto;
import com.portfolio.portfolio.repositorys.RProyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto proyectoRepo;


    public List<Proyecto> list(){
        return proyectoRepo.findAll();
    }

    public Proyecto getPro(Long id){
        Proyecto pro = proyectoRepo.findById(id).orElse(null);
        return pro;
    }
    public void save(Proyecto pro){
        proyectoRepo.save(pro);
    }
    public void delete(Long id){
        proyectoRepo.deleteById(id);
    }
    public void edit(Proyecto pro){
        proyectoRepo.save(pro);
    }
}
