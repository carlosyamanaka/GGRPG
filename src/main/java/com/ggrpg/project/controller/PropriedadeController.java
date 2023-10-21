package com.ggrpg.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Propriedade;
import com.ggrpg.project.service.PropriedadeService;

@RestController
@RequestMapping(name = "/propriedades")
public class PropriedadeController {

    @Autowired
    private PropriedadeService service;

    @GetMapping
    public ResponseEntity<List<Propriedade>> findAll() {
        List<Propriedade> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Propriedade> findById(@PathVariable Integer id) {
        Propriedade obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
