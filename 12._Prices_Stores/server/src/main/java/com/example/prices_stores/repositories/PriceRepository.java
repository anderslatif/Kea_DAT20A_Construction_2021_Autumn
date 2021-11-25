package com.example.prices_stores.repositories;

import com.example.prices_stores.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {

}
