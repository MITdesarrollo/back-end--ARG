package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Persona;
import com.portfolio.portfolio.services.SPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = {"https://portfolio-mariel-torres.web.app", "http://localhost:4200"})
public class CPersona {
    @Autowired
    SPersona servPerso;

    @GetMapping("/list")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = servPerso.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable("id") Long id){
        Persona perso = servPerso.getPersona(id);
        return new ResponseEntity(perso, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void create(@RequestBody Persona persona){
        servPerso.save(persona);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        servPerso.delete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Persona persona){
        servPerso.edit(persona);
    }
}
