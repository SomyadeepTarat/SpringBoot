package com.BusinessCompany.PaymentService.service;

import com.BusinessCompany.PaymentService.entity.payment;
import com.BusinessCompany.PaymentService.repository.paymentRepository;
import org.springframework.stereotype.Service;

@Service
public class paymentService {

    private final paymentRepository repository;

    public paymentService(
            paymentRepository repository) {
        this.repository = repository;
    }

    public payment create(payment payment) {
        return repository.save(payment);
    }

    public payment get(Long id) {
        return repository.findById(id)
                .orElseThrow();
    }
}