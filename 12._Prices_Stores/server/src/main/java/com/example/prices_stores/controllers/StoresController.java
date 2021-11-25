package com.example.prices_stores.controllers;

import com.example.prices_stores.models.Store;
import com.example.prices_stores.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoresController {

    @Autowired
    StoreRepository stores;

    @GetMapping("/stores")
    public List<Store> getStores() {
        return stores.findAll();
    }

    @GetMapping("/stores/{storeId}")
    public Store getStore(@PathVariable Long storeId) {
        return stores.findById(storeId).get();
    }


}
