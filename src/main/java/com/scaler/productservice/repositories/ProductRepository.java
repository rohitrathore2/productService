package com.scaler.productservice.repositories;

import com.scaler.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // product repo should contain all the method(CRUD) related to product

    // get product by id:
    @Override
    Optional<Product> findById(Long id);

    // get all products
    @Override
    List<Product> findAll();

    // create product
    @Override
    Product save(Product product);

}

/*
       1. Repository should be an interface
       2. Repository should extend JpaRepository
 */
