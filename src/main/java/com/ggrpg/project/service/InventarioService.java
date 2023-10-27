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

}
