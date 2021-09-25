package com.ethelen.be.controller;

import com.ethelen.be.entity.ProviderSlot;
import com.ethelen.be.services.ProviderSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ProviderSlotController {

    @Autowired
    ProviderSlotService providerSlotService;

    @GetMapping("/provider-slot")
    public List<ProviderSlot> getAllProvider(){
        return providerSlotService.findProviderSlot();
    }
}
