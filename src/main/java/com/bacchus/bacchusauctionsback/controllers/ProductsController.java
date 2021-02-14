package com.bacchus.bacchusauctionsback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@CrossOrigin(origins = "http://127.0.0.1:8080")
@RestController
public class ProductsController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/products")
    public ResponseEntity<Object[]> getAllProducts() {
        return restTemplate
                .getForEntity("http://uptime-auction-api.azurewebsites.net/api/Auction", Object[].class);
    }
}
