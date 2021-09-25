package com.ethelen.be.services;

import com.ethelen.be.entity.ProviderSlot;
import com.ethelen.be.repository.ProviderSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderSlotServiceImpl implements ProviderSlotService {

    @Autowired
    ProviderSlotRepository providerSlotRepository;

    @Override
    public List<ProviderSlot> findProviderSlot() {
        return providerSlotRepository.findAll();
    }
}
