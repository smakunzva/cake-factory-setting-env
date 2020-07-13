package com.cakefactory.bakery.cakefactory.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CatalogControllerTest {

    private Map<String, Integer> pastries = new LinkedHashMap<>();

    @BeforeEach
    void setUp() {
        pastries.put("Alexandertorte", 100);
        pastries.put("Alfajor", 12);
        pastries.put("Apple pie", 500);
        pastries.put("Bahulu", 345);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPastries() {
        assertTrue(pastries.get("Alexandertorte").equals(100));
    }
}