package com.ethelen.be.services;

import com.ethelen.be.entity.CheatEngine;
import com.ethelen.be.repository.CheatEngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheatEngineServiceImpl implements CheatEngineService{

    @Autowired
    CheatEngineRepository cheatEngineRepository;

    @Override
    public List<CheatEngine> findCheatEngine() {
        return cheatEngineRepository.findAll();
    }
}
