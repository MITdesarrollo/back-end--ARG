package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Educacion;
import com.portfolio.portfolio.repositorys.REducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SEducacion {

    @Autowired
    REducacion eduRepo;

    public List<Educacion> list(){
        return eduRepo.findAll();
    }

    public Educacion getEstudio(Long id){
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
    public void save(Educacion edu){
        eduRepo.save(edu);
    }
    public void delete(Long id){
        eduRepo.deleteById(id);
    }
    public void edit(Educacion edu){
        eduRepo.save(edu);
    }
}
