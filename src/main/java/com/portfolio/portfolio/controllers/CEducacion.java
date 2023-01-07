package com.portfolio.portfolio.controllers;


import com.portfolio.portfolio.entitys.Educacion;
import com.portfolio.portfolio.services.SEducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("educacion")
@CrossOrigin(origins = {"https://portfolio-mariel-torres.web.app", "http://localhost:4200"})
public class CEducacion {

    @Autowired
    SEducacion servEdu;

    @GetMapping("/list")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = servEdu.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> detail(@PathVariable("id") Long id){
        Educacion edu = servEdu.getEstudio(id);
        return new ResponseEntity(edu, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void create(@RequestBody Educacion edu){
        servEdu.save(edu);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        servEdu.delete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Educacion edu){
        servEdu.edit(edu);
    }
}
