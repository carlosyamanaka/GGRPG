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

import com.ggrpg.project.entity.Inventario;
import com.ggrpg.project.service.InventarioService;

@RestController
@RequestMapping(value = "/inventarios")
public class InventarioController {

    @Autowired
    private InventarioService service;

    @GetMapping
    public ResponseEntity<List<Inventario>> findAll() {
        List<Inventario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id_inventario}")
    public ResponseEntity<Inventario> findById(@PathVariable("id_inventario") Integer id) {
        Inventario obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Inventario> insert(@RequestBody Inventario obj) {
        service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_inventario())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id_inventario}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id_inventario}")
    public ResponseEntity<Inventario> update(@PathVariable Integer id, @RequestBody Inventario obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
