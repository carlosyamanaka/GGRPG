package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Ataque;

//1. Adicionada interface AtaqueRepository 
//2. Extends JpaRepository para facilitar manipulação de entidades 
@Repository
public interface AtaqueRepository extends JpaRepository<Ataque, Integer> {

}
