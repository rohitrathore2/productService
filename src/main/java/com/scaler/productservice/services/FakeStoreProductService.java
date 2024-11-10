package com.scaler.productservice.services;

import com.scaler.productservice.configurations.RestTemplateConfiguration;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplateConfiguration restTemplate;

    public FakeStoreProductService(RestTemplateConfiguration restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product getProductDetails(Long id) {
        System.out.println("Hello rohit");
        return null;
    }
}
