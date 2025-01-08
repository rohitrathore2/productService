package com.scaler.productservice.repositories;

import com.scaler.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // product repo should contain all the method(CRUD) related to product
}

/*
       1. Repository should be an interface
       2. Repository should extends JpaRepository
 */
