package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Inventario;
import com.ggrpg.project.repository.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository repository;

    public List<Inventario> findAll() {
        return repository.findAll();
    }

    public Inventario findById(Integer id) {
        Optional<Inventario> obj = repository.findById(id);

        return obj.get();
    }

    public Inventario insert(Inventario obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Inventario update(Integer id, Inventario obj) {
        Inventario entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Inventario entity, Inventario obj) {
        entity.setCapacidade(obj.getCapacidade());
        entity.setLotacao(obj.getLotacao());
        entity.setLimite_credito(obj.getLimite_credito());
        entity.setFicha(obj.getFicha());
    }

}
