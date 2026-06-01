package com.BusinessCompany.customerService.controller;

import com.BusinessCompany.CustomerService.entity.customer;
import com.BusinessCompany.CustomerService.service.customerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class customerController {

    private final customerService service;

    public customerController(customerService service) {
        this.service = service;
    }

    @PostMapping
    public customer create(
            @RequestBody customer customer) {

        return service.create(customer);
    }

    @GetMapping("/{id}")
    public customer get(
            @PathVariable Long id) {

        return service.get(id);
    }
}