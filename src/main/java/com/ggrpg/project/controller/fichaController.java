package com.ggrpg.project.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping
    public ResponseEntity<Ficha> insert(@RequestBody Ficha obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_ficha())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Ficha> update(@PathVariable Integer id, @RequestBody Ficha obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
