package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Experiencia;
import com.portfolio.portfolio.services.SExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "https://portfolio-mariel-torres.web.app")
public class CExperiencia {
    @Autowired
    SExperiencia servExp;

    @GetMapping("/list")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = servExp.list();
        return new ResponseEntity(list, HttpStatus.OK);}

    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> detalle(@PathVariable("id") Long id){
        Experiencia exp = servExp.getExp(id);
        return new ResponseEntity( exp, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void create(@RequestBody Experiencia  exp){
        servExp.save( exp);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        servExp.edelete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Experiencia  exp){
        servExp.edit( exp);
    }
}
