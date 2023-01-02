package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Proyecto;
import com.portfolio.portfolio.services.SProyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    @Autowired
    SProyecto servProy;
    @GetMapping("/list")
    public ResponseEntity<List<Proyecto>> list(){
        List<Proyecto> list = servProy.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> detail(@PathVariable("id") Long id){
        Proyecto proyecto = servProy.getPro(id);
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void create(@RequestBody Proyecto proyecto){
        servProy.save(proyecto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        servProy.delete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Proyecto proyecto){
        servProy.edit(proyecto);
    }
}
