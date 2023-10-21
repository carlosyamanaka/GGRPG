package com.ggrpg.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Atributo;
import com.ggrpg.project.service.AtributoService;

@RestController
@RequestMapping(value = "/atributos")
public class AtributoController {

    @Autowired
    private AtributoService service;

    @GetMapping
    public ResponseEntity<List<Atributo>> findAll() {
        List<Atributo> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Atributo> findById(@PathVariable Integer id) {
        Atributo obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
