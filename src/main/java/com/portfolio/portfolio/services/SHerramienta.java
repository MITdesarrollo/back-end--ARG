package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Herramienta;
import com.portfolio.portfolio.repositorys.RHerramienta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SHerramienta {
    @Autowired
    RHerramienta herrRepo;

    public List<Herramienta> list(){
        return herrRepo.findAll();
    }

    public Herramienta getErr(Long id){
        Herramienta herr = herrRepo.findById(id).orElse(null);
        return herr;
    }
    public void save(Herramienta herr){
        herrRepo.save(herr);
    }
    public void edelete(Long id){
        herrRepo.deleteById(id);
    }
    public void edit(Herramienta herr){
        herrRepo.save(herr);
    }
}
