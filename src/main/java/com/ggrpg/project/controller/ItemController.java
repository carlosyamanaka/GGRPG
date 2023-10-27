package com.ggrpg.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggrpg.project.entity.Item;
import com.ggrpg.project.service.ItemService;

@RestController
@RequestMapping(name = "/pericias")
public class ItemController {
    @Autowired
    private ItemService service;

    @GetMapping
    public ResponseEntity<List<Item>> findAll() {
        List<Item> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(name = "/{id}")
    public ResponseEntity<Item> findById(@PathVariable Integer id) {
        Item obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
