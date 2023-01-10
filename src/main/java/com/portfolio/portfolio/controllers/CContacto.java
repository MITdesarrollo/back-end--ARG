package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Contacto;
import com.portfolio.portfolio.entitys.Educacion;
import com.portfolio.portfolio.services.SContacto;
import com.portfolio.portfolio.services.SEducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contacto")
@CrossOrigin(origins = {"https://portfolio-mariel-torres.web.app", "http://localhost:4200"})
public class CContacto {
    @Autowired
    SContacto servCont;

    @GetMapping("/list")
    public ResponseEntity<List<Contacto>> list(){
        List<Contacto> list = servCont.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Contacto> detail(@PathVariable("id") Long id){
        Contacto cont = servCont.getCont(id);
        return new ResponseEntity(cont, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void create(@RequestBody Contacto cont){
        servCont.save(cont);
        System.out.println(cont);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        servCont.delete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Contacto cont){
        servCont.edit(cont);
    }
}
