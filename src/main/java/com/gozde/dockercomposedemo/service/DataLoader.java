package com.gozde.dockercomposedemo.service;

import org.springframework.stereotype.Component;

import com.gozde.dockercomposedemo.model.Customer;
import com.gozde.dockercomposedemo.repository.CustomerRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

    private final CustomerRepository customerRepository;


    public DataLoader(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostConstruct
    public void init() {
//        customerRepository.save(new Customer("Gozde", "Yalcin"));
//        customerRepository.save(new Customer("Boncuk", "Yalcin"));
        customerRepository.save(Customer.builder().firstName("Gozde").lastName("Yalcin").build());
        customerRepository.save(Customer.builder().firstName("Boncuk").lastName("Yalcin").build());
    }
}
