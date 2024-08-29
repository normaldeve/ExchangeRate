package com.example.hello;

import java.math.BigDecimal;

public class PaymentService {
    public Payment prepare() {
        Payment payment = new Payment();
        return payment;
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment payment = paymentService.prepare();
        System.out.println(payment.toString());
    }
}
