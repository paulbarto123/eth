package com.ethelen.be.services;

import com.ethelen.be.entity.AutoWinRate;
import com.ethelen.be.repository.AutoWinRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoWinRateServiceImpl implements AutoWinRateService{

    @Autowired
    AutoWinRateRepository autoWinRateRepository;

    @Override
    public List<AutoWinRate> findAutoWinRate() {
        return autoWinRateRepository.findAll();
    }
}
