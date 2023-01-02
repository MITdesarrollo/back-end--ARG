package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Experiencia;
import com.portfolio.portfolio.repositorys.RExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia expRepo;

    public List<Experiencia> list(){
        return expRepo.findAll();
    }

    public Experiencia getExp(Long id){
        Experiencia exp = expRepo.findById(id).orElse(null);
        return exp;
    }
    public void save(Experiencia exp){
        expRepo.save(exp);
    }
    public void edelete(Long id){
        expRepo.deleteById(id);
    }
    public void edit(Experiencia exp){
        expRepo.save(exp);
    }
}
