package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{

}
