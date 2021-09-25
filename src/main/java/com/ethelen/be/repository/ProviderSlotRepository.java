package com.ethelen.be.repository;

import com.ethelen.be.entity.ProviderSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderSlotRepository extends JpaRepository<ProviderSlot, String> {
}
