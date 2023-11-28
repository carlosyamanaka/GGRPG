package com.ggrpg.project.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ggrpg.project.entity.Habilidade;
import com.ggrpg.project.service.HabilidadeService;

@RestController
@RequestMapping(value = "/habilidades")
@CrossOrigin(origins = "*")
public class HabilidadeController {

    @Autowired
    private HabilidadeService service;

    @GetMapping
    public ResponseEntity<List<Habilidade>> findAll() {
        List<Habilidade> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id_habilidade}")
    public ResponseEntity<Habilidade> findById(@PathVariable("id_habilidade") Integer id) {
        Habilidade obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Habilidade> insert(@RequestBody Habilidade obj) {
        service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_habilidade())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id_habilidade}")
    public ResponseEntity<Void> delete(@PathVariable("id_habilidade") Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id_habilidade}")
    public ResponseEntity<Habilidade> update(@PathVariable Integer id, @RequestBody Habilidade obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
