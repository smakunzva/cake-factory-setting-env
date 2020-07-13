package com.cakefactory.bakery.cakefactory.service;

import com.cakefactory.bakery.cakefactory.entity.PastriesEntity;
import com.cakefactory.bakery.cakefactory.repository.PastriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeFactoryService {

    private final PastriesRepository pastriesRepository;

    @Autowired
    public CakeFactoryService(PastriesRepository pastriesRepository) {
        this.pastriesRepository = pastriesRepository;
    }

    public List<PastriesEntity> getAllPastries() {
        return (List<PastriesEntity>)this.pastriesRepository.findAll();
    }

    public Number getPastryPrice(String name) {
        return null;
    }
}
