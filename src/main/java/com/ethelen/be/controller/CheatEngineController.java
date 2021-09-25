package com.ethelen.be.controller;

import com.ethelen.be.entity.CheatEngine;
import com.ethelen.be.services.CheatEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
public class CheatEngineController {

    @Autowired
    CheatEngineService cheatEngineService;


    @GetMapping("/cheat-engine")
    public List<CheatEngine> getAllCheatEngine(){
        return cheatEngineService.findCheatEngine();
    }
}
