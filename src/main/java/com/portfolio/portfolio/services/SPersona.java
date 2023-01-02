package com.portfolio.portfolio.services;

import com.portfolio.portfolio.entitys.Persona;
import com.portfolio.portfolio.repositorys.RPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SPersona {
    @Autowired
    public RPersona repoPersona;


    public List<Persona> list(){
        return repoPersona.findAll();
    }

    public Persona getPersona(Long id){
        Persona pers = repoPersona.findById(id).orElse(null);
        return pers;
    }

    public void save(Persona pers){
        repoPersona.save(pers);
    }

    public void delete(Long id){
        repoPersona.deleteById(id);
    }

    public void edit(Persona pers){
        repoPersona.save(pers);
    }
}
