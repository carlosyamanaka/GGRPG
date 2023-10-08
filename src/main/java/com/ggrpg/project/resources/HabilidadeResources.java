package com.ggrpg.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Habilidade;
import com.ggrpg.project.service.HabilidadeService;

@RestController
@RequestMapping(name = "/habilidades")
public class HabilidadeResources {

    @Autowired
    private HabilidadeService service;

    @GetMapping
    public ResponseEntity<List<Habilidade>> findAll() {
        List<Habilidade> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Habilidade> findById(@PathVariable Integer id) {
        Habilidade obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
