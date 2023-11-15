package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
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

        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }

    public Ataque insert(Ataque obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Ataque update(Integer id, Ataque obj) {
        Ataque entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Ataque entity, Ataque obj) {
        entity.setArma(obj.getArma());
        entity.setTeste(obj.getTeste());
        entity.setDano(obj.getDano());
        entity.setModificadores(obj.getModificadores());
        entity.setFicha(obj.getFicha());
    }

}
