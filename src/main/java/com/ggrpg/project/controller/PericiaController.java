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

import com.ggrpg.project.entity.Pericia;
import com.ggrpg.project.service.PericiaService;

@RestController
@RequestMapping(name = "/pericias")
public class PericiaController {
    @Autowired
    private PericiaService service;

    @GetMapping
    public ResponseEntity<List<Pericia>> findAll() {
        List<Pericia> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Pericia> findById(@PathVariable Integer id) {
        Pericia obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Pericia> insert(@RequestBody Pericia obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_pericia())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Pericia> update(@PathVariable Integer id, @RequestBody Pericia obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
