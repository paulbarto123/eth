package com.ethelen.be.repository;

import com.ethelen.be.entity.Deposite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositeRepository extends JpaRepository<Deposite, String> {
}
