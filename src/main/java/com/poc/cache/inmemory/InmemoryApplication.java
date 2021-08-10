package com.poc.cache.inmemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class InmemoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InmemoryApplication.class, args);
    }

}
