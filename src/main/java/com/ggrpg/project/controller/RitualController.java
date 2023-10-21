package com.ggrpg.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Ritual;
import com.ggrpg.project.service.RitualService;

@RestController
@RequestMapping(value = "/rituais")
public class RitualController {

    @Autowired
    private RitualService service;

    @GetMapping
    public ResponseEntity<List<Ritual>> findAll() {
        List<Ritual> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Ritual> findById(@PathVariable Integer id) {
        Ritual obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
