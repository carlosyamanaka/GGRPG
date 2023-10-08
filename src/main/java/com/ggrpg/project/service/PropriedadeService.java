package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Propriedade;
import com.ggrpg.project.repository.PropriedadeRepository;

@Service
public class PropriedadeService {

    @Autowired
    private PropriedadeRepository repository;

    public List<Propriedade> findAll() {
        return repository.findAll();
    }

    public Propriedade findById(Integer id) {
        Optional<Propriedade> obj = repository.findById(id);
        return obj.get();
    }
}
