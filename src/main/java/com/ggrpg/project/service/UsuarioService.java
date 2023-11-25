package com.ggrpg.project.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggrpg.project.entity.Usuario;
import com.ggrpg.project.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new NoSuchElementException("Não foi possível encontrar o Ataque com o ID: " + id);
        }
    }

    public Usuario insert(Usuario obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Usuario update(Integer id, Usuario obj) {
        Usuario entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Usuario entity, Usuario obj) {
        entity.setEmail(obj.getEmail());
    }
}
