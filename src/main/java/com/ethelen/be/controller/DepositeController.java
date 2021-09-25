package com.ethelen.be.controller;

import com.ethelen.be.entity.Deposite;
import com.ethelen.be.services.DepositeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class DepositeController {

    @Autowired
    DepositeService depositeService;


    @GetMapping("/deposite")
    public List<Deposite> getAllDeposite(){
        return depositeService.findDeposite();
    }
}
