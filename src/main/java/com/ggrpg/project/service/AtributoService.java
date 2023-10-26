package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Atributo;
import com.ggrpg.project.repository.AtributoRepository;

@Service
public class AtributoService {

    @Autowired
    private AtributoRepository repository;

    public List<Atributo> findAll() {
        return repository.findAll();
    }

    public Atributo findById(Integer id) {
        Optional<Atributo> obj = repository.findById(id);
        if(obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }
}
