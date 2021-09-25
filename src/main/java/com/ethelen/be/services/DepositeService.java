package com.ethelen.be.services;

import com.ethelen.be.entity.AutoWinRate;
import com.ethelen.be.entity.Deposite;

import java.util.List;

public interface DepositeService {
    public List<Deposite> findDeposite();
}
