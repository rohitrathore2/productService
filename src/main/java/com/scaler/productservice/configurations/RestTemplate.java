//package com.scaler.productservice.configurations;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RestTemplateConfiguration {
//
//    @Bean
//    public org.springframework.web.client.RestTemplate restTemplate(){
//        return new org.springframework.web.client.RestTemplate();
//    }
//}
//-------------------------
package com.scaler.productservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RestTemplate {

    @Bean
    public org.springframework.web.client.RestTemplate restTemplate() {
        return new org.springframework.web.client.RestTemplate();
    }
}