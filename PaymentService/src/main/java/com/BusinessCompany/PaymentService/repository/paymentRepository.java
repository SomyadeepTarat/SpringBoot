package com.BusinessCompany.PaymentService.repository;

import com.BusinessCompany.PaymentService.entity.payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentRepository
        extends JpaRepository<payment, Long> {
}