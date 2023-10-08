package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Propriedade;

@Repository
public interface PropriedadeRepository extends JpaRepository<Propriedade, Integer> {

}
