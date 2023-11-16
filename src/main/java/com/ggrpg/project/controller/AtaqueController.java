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

import com.ggrpg.project.entity.Ataque;
import com.ggrpg.project.repository.AtaqueRepository;
import com.ggrpg.project.service.AtaqueService;

//Obs. Creio que nesse estilo de arquitetura, Resources é o equivalente a Controller -> Preciso arrumar isso depois 
//1. Adicionadas annotations 
//a. RestController: indica existencia de um controller
//b. RequestMapping: requisita um endereço de url
//c. Autowired: Injeção de dependencia automática -> É depreciado, um péssimo costume, mas pela simplicidade do projeto optei por manter// pelo menos por enquanto. 
//d. GetMapping: Lidar com requisições HTTP GET 

//Foram retiradas as implementações e substituídas por annotations, caso deseje voltar apenas crie equals e hashCodes para os id's e Constructors para os atributos, sem as relações.

@RestController
@RequestMapping(value = "/ataques")
public class AtaqueController {

    @Autowired
    private AtaqueService service;

    @Autowired
    AtaqueRepository repository;

    @GetMapping
    public ResponseEntity<List<Ataque>> findAll() {
        List<Ataque> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id_ataque}")
    public ResponseEntity<Ataque> findById(@PathVariable("id_ataque") Integer id) {
        Ataque obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Ataque> insert(@RequestBody Ataque obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_ataque())
                .toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id_ataque}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id_ataque}")
    public ResponseEntity<Ataque> update(@PathVariable Integer id, @RequestBody Ataque obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}
