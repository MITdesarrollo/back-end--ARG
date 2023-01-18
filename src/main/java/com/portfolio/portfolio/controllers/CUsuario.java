package com.portfolio.portfolio.controllers;

import com.portfolio.portfolio.entitys.Usuario;
import com.portfolio.portfolio.services.SUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins = {"https://portfolio-mariel-torres.web.app", "http://localhost:4200"})
public class CUsuario {
    @Autowired
    SUsuario userService;

    @GetMapping("/list")
    public ResponseEntity<List<Usuario>> list(){
        List<Usuario> list = userService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Usuario> detail(@PathVariable("id") Long id){
        Usuario user = userService.getUser(id);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PostMapping("/create")
    public void create(@RequestBody Usuario user){
        userService.save(user);
        System.out.println("crea");
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @PutMapping("/edit")
    public void edit(@RequestBody Usuario user){
        userService.edit(user);
    }
}
