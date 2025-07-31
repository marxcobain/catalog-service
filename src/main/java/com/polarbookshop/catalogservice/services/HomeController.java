package com.polarbookshop.catalogservice.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Polar Bookshop Catalog Service!";
    }

    @GetMapping("/health")
    public String health() {
        return "Catalog Service is running!";
    }
}