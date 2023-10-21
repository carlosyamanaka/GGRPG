package com.ggrpg.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Ficha;
import com.ggrpg.project.service.FichaService;

@RestController
@RequestMapping(name = "/fichas")
public class FichaController {

    @Autowired
    private FichaService service;

    @GetMapping
    public ResponseEntity<List<Ficha>> findAll() {
        List<Ficha> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Ficha> findById(@PathVariable Integer id) {
        Ficha obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
