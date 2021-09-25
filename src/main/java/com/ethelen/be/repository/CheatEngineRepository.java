package com.ethelen.be.repository;

import com.ethelen.be.entity.CheatEngine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheatEngineRepository extends JpaRepository<CheatEngine, String> {
}
