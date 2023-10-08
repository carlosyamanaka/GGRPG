package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Pericia;

@Repository
public interface PericiaRepository extends JpaRepository<Pericia, Integer> {

}
