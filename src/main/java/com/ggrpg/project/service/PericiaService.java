package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Pericia;
import com.ggrpg.project.repository.PericiaRepository;

@Service
public class PericiaService {

    @Autowired
    private PericiaRepository repository;

    public List<Pericia> findAll() {
        return repository.findAll();
    }

    public Pericia findById(Integer id) {
        Optional<Pericia> obj = repository.findById(id);
        return obj.get();
    }
}