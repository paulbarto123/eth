package com.ethelen.be.services;

import com.ethelen.be.entity.CheatEngine;
import com.ethelen.be.entity.Deposite;
import com.ethelen.be.repository.CheatEngineRepository;
import com.ethelen.be.repository.DepositeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepositeServiceImpl implements DepositeService{

    @Autowired
    DepositeRepository depositeRepository;

    @Override
    public List<Deposite> findDeposite() {
        return depositeRepository.findAll();
    }
}
