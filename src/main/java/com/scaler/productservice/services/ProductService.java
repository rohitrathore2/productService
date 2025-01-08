package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(Long id);
    public Product createProduct(String title, String description, String image, double price, String category);
    public List<Product> getAllProducts();

    public Product updateProduct(Long id, Product product);

    public void deleteProduct(Long id);
}
