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

    @GetMapping(value = "/{id_atributo}") // Use "value" to specify the URL path
    public ResponseEntity<Atributo> findById(@PathVariable("id_atributo") Integer id) { // Specify the variable name in
        // @PathVariable
        Atributo obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Atributo> insert(@RequestBody Atributo obj) {
        service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_atributo())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id_atributo}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id_atributo}")
    public ResponseEntity<Atributo> update(@PathVariable Integer id, @RequestBody Atributo obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
