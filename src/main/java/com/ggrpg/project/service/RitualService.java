package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Ritual;
import com.ggrpg.project.repository.RitualRepository;

@Service
public class RitualService {

    @Autowired
    private RitualRepository repository;

    public List<Ritual> findAll() {
        return repository.findAll();
    }

    public Ritual findById(Integer id) {
        Optional<Ritual> obj = repository.findById(id);
        return obj.get();
    }
}
