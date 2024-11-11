package com.scaler.productservice.services;
import com.scaler.productservice.models.Category;
import org.springframework.web.client.RestTemplate;
import com.scaler.productservice.dtos.FakeStoreProductDto;
import com.scaler.productservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FakeStoreProductService implements ProductService{

    @Autowired
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Product getProductDetails(Long id) {
        FakeStoreProductDto responseDto =
                restTemplate.getForObject
                        ("https://fakestoreapi.com/products/" + id,
                        FakeStoreProductDto.class);
//        System.out.println("Hello Rohit");
        Product product = new Product();
        product.setId(responseDto.getId());
        product.setTitle(responseDto.getTitle());
        product.setDescription(responseDto.getDescription());
        product.setPrice(Double.parseDouble(responseDto.getPrice()));
        product.setImageURL(responseDto.getImage());

        Category category = new Category();
        category.setName(responseDto.getCategory());

        product.setCategory(category);

        return product;
    }
}
