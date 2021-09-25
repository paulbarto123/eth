package com.ethelen.be.repository;

import com.ethelen.be.entity.AutoWinRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoWinRateRepository extends JpaRepository<AutoWinRate, String> {
}
