package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
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
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }

    public Propriedade insert(Propriedade obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Propriedade update(Integer id, Propriedade obj) {
        Propriedade entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Propriedade entity, Propriedade obj) {
        entity.setOrigem(obj.getOrigem());
        entity.setClasse(obj.getClasse());
        entity.setTrilha(obj.getTrilha());
        entity.setNex(obj.getNex());
        entity.setPeRodada(obj.getPeRodada());
        entity.setPeTot(obj.getPeTot());
        entity.setPvTot(obj.getPvTot());
        entity.setDeslocamento(obj.getDeslocamento());
        entity.setSanidadeTot(obj.getSanidadeTot());
        entity.setDefesa(obj.getDefesa());
    }


}
