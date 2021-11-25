package com.example.prices_stores.controllers;

import com.example.prices_stores.models.Price;
import com.example.prices_stores.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PricesController {

    @Autowired
    PriceRepository prices;

    @GetMapping("/prices")
    public List<Price> getPrices() {
        return prices.findAll();
    }
}
