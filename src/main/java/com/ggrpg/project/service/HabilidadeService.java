package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Habilidade;
import com.ggrpg.project.repository.HabilidadeRepository;

@Service
public class HabilidadeService {

    @Autowired
    private HabilidadeRepository repository;

    public List<Habilidade> findAll() {
        return repository.findAll();
    }

    public Habilidade findById(Integer id) {
        Optional<Habilidade> obj = repository.findById(id);

        return obj.get();
    }

}
