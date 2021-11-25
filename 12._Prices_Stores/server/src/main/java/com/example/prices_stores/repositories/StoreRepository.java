package com.example.prices_stores.repositories;

import com.example.prices_stores.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

}
