package com.ggrpg.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Item;
import com.ggrpg.project.repository.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<Item> findAll() {
        return repository.findAll();
    }

    public Item findById(Integer id) {
        Optional<Item> obj = repository.findById(id);

        return obj.get();
    }

    public Item insert(Item obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Item update(Integer id, Item obj) {
        Item entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Item entity, Item obj) {
        entity.setNome(obj.getNome());
        entity.setEspaco(obj.getEspaco());
        entity.setModificadores(obj.getModificadores());
        entity.setTeste(obj.getTeste());
        entity.setDano(obj.getDano());
        entity.setAlcance(obj.getAlcance());
        entity.setEfeito(obj.getEfeito());
    }

}