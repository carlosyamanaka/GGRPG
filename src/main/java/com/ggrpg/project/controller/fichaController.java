package com.ggrpg.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Ficha;

@RestController
@RequestMapping(value = "/fichas")
public class fichaController {

    @GetMapping
    public ResponseEntity<Ficha> findAll() {
        Ficha f1 = new Ficha(1, "1", "1", "1");

        return ResponseEntity.ok().body(f1);
    }

}
