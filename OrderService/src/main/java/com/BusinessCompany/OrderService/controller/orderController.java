package com.BusinessCompany.OrderService.controller;

import com.BusinessCompany.OrderService.dto.orderResponse;
import com.BusinessCompany.OrderService.entity.Orders;
import com.BusinessCompany.OrderService.service.orderService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class orderController {

    private final orderService service;

    public orderController(
            orderService service) {
        this.service = service;
    }

    @PostMapping
    public Orders create(
            @RequestBody Orders order) {

        return service.create(order);
    }

    @GetMapping("/{id}")
    public orderResponse get(
            @PathVariable Long id) {

        return service.get(id);
    }
}