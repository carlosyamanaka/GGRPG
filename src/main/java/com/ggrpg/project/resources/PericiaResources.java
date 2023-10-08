package com.ggrpg.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Pericia;
import com.ggrpg.project.service.PericiaService;

@RestController
@RequestMapping(name = "/pericias")
public class PericiaResources {
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
}
