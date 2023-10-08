package com.ggrpg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ggrpg.project.entity.Ritual;

@Repository
public interface RitualRepository extends JpaRepository<Ritual, Integer> {

}
