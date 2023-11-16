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

import com.ggrpg.project.entity.Propriedade;
import com.ggrpg.project.service.PropriedadeService;

@RestController
@RequestMapping(value = "/propriedades")
public class PropriedadeController {

    @Autowired
    private PropriedadeService service;

    @GetMapping
    public ResponseEntity<List<Propriedade>> findAll() {
        List<Propriedade> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id_propriedade}")
    public ResponseEntity<Propriedade> findById(@PathVariable("id_propriedade") Integer id) {
        Propriedade obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Propriedade> insert(@RequestBody Propriedade obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_propriedade())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id_propriedade}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id_propriedade}")
    public ResponseEntity<Propriedade> update(@PathVariable Integer id, @RequestBody Propriedade obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
