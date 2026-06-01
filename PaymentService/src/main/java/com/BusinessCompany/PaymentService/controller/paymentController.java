package com.BusinessCompany.PaymentService.controller;

import com.BusinessCompany.PaymentService.entity.payment;
import com.BusinessCompany.PaymentService.service.paymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class paymentController {

    private final paymentService service;

    public paymentController(
            paymentService service) {
        this.service = service;
    }

    @PostMapping
    public payment create(
            @RequestBody payment payment) {

        payment.setStatus("SUCCESS");

        return service.create(payment);
    }

    @GetMapping("/{id}")
    public payment get(
            @PathVariable Long id) {

        return service.get(id);
    }
}