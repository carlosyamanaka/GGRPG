package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Ataque;
import com.ggrpg.project.repository.AtaqueRepository;

@Service
public class AtaqueService {

    @Autowired
    private AtaqueRepository repository;

    public List<Ataque> findAll() {
        return repository.findAll();
    }

    public Ataque findById(Integer id) {
        // Optional representa valores que podem ou não estar presentes -> Evita
        // nullPointerException - se trata de uma boa prática
        Optional<Ataque> obj = repository.findById(id);
        return obj.get();
    }

}
