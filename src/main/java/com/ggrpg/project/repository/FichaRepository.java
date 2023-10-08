package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Ficha;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Integer> {

}
