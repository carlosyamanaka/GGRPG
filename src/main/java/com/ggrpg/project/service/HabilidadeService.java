package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
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

        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }

    public Habilidade insert(Habilidade obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Habilidade update(Integer id, Habilidade obj) {
        Habilidade entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Habilidade entity, Habilidade obj) {
        entity.setDescricao(obj.getDescricao());
        entity.setPagina(obj.getPagina());
        entity.setId_ficha(obj.getId_ficha());
    }

}
