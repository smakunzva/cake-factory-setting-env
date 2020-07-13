package com.cakefactory.bakery.cakefactory.controller;

import com.cakefactory.bakery.cakefactory.service.CakeFactoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@Slf4j
public class CatalogController {

    private final CakeFactoryService cakeFactoryService;

    @Autowired
    public CatalogController(CakeFactoryService cakeFactoryService) {
        this.cakeFactoryService = cakeFactoryService;
    }

    public List getPastries() {
        return this.cakeFactoryService.getAllPastries();
    }

    public void getPastryPrice() {

    }

}
