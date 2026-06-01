package com.BusinessCompany.OrderService.service;

import com.BusinessCompany.OrderService.dto.*;
import com.BusinessCompany.OrderService.entity.Orders;
import com.BusinessCompany.OrderService.repository.orderRepository;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class orderService {

    private final orderRepository repository;

    private final RestTemplate restTemplate;

    public orderService(
            orderRepository repository,
            RestTemplate restTemplate) {

        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    public Orders create(Orders order) {

        return repository.save(order);
    }

    public orderResponse get(Long id) {

        Orders order =
                repository.findById(id)
                        .orElseThrow();

        customerDTO customer =
                restTemplate.getForObject(
                        "http://localhost:8081/customers/"
                                + order.getCustomerId(),
                        customerDTO.class
                );

        paymentDTO payment =
                restTemplate.getForObject(
                        "http://localhost:8083/payments/1",
                        paymentDTO.class
                );

        orderResponse response =
                new orderResponse();

        response.setOrder(order);
        response.setCustomer(customer);
        response.setPayment(payment);

        return response;
    }
}
