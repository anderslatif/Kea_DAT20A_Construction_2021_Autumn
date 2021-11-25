package com.example.prices_stores.controllers;

import com.example.prices_stores.DTO.response.PriceCreateDTO;
import com.example.prices_stores.models.Price;
import com.example.prices_stores.repositories.PriceRepository;
import com.example.prices_stores.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PricesController {

    @Autowired
    PriceRepository prices;

    @Autowired
    StoreRepository stores;


    @GetMapping("/prices")
    public List<Price> getPrices() {
        return prices.findAll();
    }

    @PostMapping("/prices/{storeId}")
    public PriceCreateDTO createPrice(@PathVariable Long storeId, @RequestBody Price priceToCreate) {
        return stores.findById(storeId).map(store -> {
                // avoid that the client can overwrite a price by id
                priceToCreate.setId(null);
                priceToCreate.setStore(store);
                Price createdPrice = prices.save(priceToCreate);
                return new PriceCreateDTO(createdPrice);
        }
        ).orElse(new PriceCreateDTO("Did not find the store by storeId"));
    }

}
