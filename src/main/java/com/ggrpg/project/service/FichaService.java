package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
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
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }

    public Ficha insert(Ficha obj) {

        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Ficha update(Integer id, Ficha obj) {
        Ficha entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Ficha entity, Ficha obj) {
        entity.setNomeDoPersonagem(obj.getNomeDoPersonagem());
        entity.setNomeDoJogador(obj.getNomeDoJogador());
        entity.setSistema(obj.getSistema());

    }
}
