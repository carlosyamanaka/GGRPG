package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Ficha;
import com.ggrpg.project.repository.FichaRepository;

@Service
public class FichaService {

    @Autowired
    private FichaRepository repository;

    public List<Ficha> findAll() {
        return repository.findAll();
    }

    public Ficha findById(Integer id) {
        Optional<Ficha> obj = repository.findById(id);
        return obj.get();
    }

}