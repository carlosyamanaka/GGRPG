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

    @GetMapping(value = "/{id_ritual}")
    public ResponseEntity<Ritual> findById(@PathVariable("id_ritual") Integer id) {
        Ritual obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Ritual> insert(@RequestBody Ritual obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_ritual())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id_ritual}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id_ritual}")
    public ResponseEntity<Ritual> update(@PathVariable Integer id, @RequestBody Ritual obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
