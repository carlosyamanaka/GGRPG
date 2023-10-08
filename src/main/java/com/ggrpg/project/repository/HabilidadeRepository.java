package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Habilidade;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Integer> {

}
