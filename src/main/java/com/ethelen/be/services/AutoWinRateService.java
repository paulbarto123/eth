package com.ethelen.be.services;

import com.ethelen.be.entity.AutoWinRate;
import com.ethelen.be.entity.CheatEngine;

import java.util.List;

public interface AutoWinRateService {
    public List<AutoWinRate> findAutoWinRate();
}
