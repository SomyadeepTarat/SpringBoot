package com.BusinessCompany.OrderService.repository;

import com.BusinessCompany.OrderService.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository
        extends JpaRepository<Orders, Long> {
}