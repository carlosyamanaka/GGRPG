package com.ggrpg.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ggrpg.project.entity.Inventario;
import com.ggrpg.project.service.InventarioService;

@RestController
@RequestMapping(name = "/inventarios")
public class InventarioController {

    @Autowired
    private InventarioService service;

    @GetMapping
    public ResponseEntity<List<Inventario>> findAll() {
        List<Inventario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Inventario> findById(@PathVariable Integer id) {
        Inventario obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
