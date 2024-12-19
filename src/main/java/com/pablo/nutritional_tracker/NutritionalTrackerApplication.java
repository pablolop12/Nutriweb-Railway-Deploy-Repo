package com.pablo.nutritional_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class NutritionalTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NutritionalTrackerApplication.class, args);
    }

    @PostConstruct
    public void logEnvironmentVariables() {
        System.out.println("Checking environment variables:");
        System.out.println("DB Host: " + System.getenv("PROD_DB_HOST"));
        System.out.println("DB Port: " + System.getenv("PROD_DB_PORT"));
        System.out.println("DB Name: " + System.getenv("PROD_DB_NAME"));
        System.out.println("DB Username: " + System.getenv("PROD_DB_USERNAME"));
        System.out.println("DB Password: " + System.getenv("PROD_DB_PASSWORD"));
    }
}
