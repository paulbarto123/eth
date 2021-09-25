package com.ethelen.be.controller;

import com.ethelen.be.entity.AutoWinRate;
import com.ethelen.be.services.AutoWinRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
public class AutoWinRateController {

    @Autowired
    AutoWinRateService autoWinRateService;


    @GetMapping("/auto-win-rate")
    public List<AutoWinRate> getAllAutoWinRate(){
        return autoWinRateService.findAutoWinRate();
    }
}
