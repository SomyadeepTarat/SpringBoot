package com.BusinessCompany.CustomerService.service;

import com.BusinessCompany.CustomerService.entity.customer;
import com.BusinessCompany.CustomerService.repository.customerRepository;
import org.springframework.stereotype.Service;

@Service
public class customerService {

    private final customerRepository repository;

    public customerService(customerRepository repository) {
        this.repository = repository;
    }

    public customer create(customer customer) {
        return repository.save(customer);
    }

    public customer get(Long id) {
        return repository.findById(id)
                .orElseThrow();
    }
}