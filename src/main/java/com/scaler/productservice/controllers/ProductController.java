package com.scaler.productservice.controllers;

import com.scaler.productservice.dtos.CreateProductRequestDto;
import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(@Qualifier("selfProductService") ProductService productService){
        this.productService = productService;
    }

    // get all products
    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }

    // get product by id
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){

        return productService.getSingleProduct(id);
    }

    // create product
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto){
        return productService.createProduct(
                requestDto.getTitle(),
            requestDto.getDescription(),
            requestDto.getImage(),
            requestDto.getPrice(),
            requestDto.getCategory()
        );
    }

    // update product
    @PutMapping
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id, product);
    }

    // delete product
    @DeleteMapping
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
