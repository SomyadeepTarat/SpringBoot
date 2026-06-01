package com.BusinessCompany.OrderService.dto;

import com.BusinessCompany.OrderService.entity.Orders;

public class orderResponse {

    private Orders order;

    private customerDTO customer;

    private paymentDTO payment;

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public customerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(
            customerDTO customer) {
        this.customer = customer;
    }

    public paymentDTO getPayment() {
        return payment;
    }

    public void setPayment(
            paymentDTO payment) {
        this.payment = payment;
    }
}