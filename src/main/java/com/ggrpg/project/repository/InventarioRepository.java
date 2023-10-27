package com.ggrpg.project.repository;

import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Inventario;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

}
