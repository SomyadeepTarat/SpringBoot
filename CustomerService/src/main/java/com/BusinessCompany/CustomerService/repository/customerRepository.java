package com.BusinessCompany.CustomerService.repository;

import com.BusinessCompany.CustomerService.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository
        extends JpaRepository<customer, Long> {
}