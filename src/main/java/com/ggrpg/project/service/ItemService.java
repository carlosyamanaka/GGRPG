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

}