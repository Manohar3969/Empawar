package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Payments;
import com.manohar3969.empawar.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payments")
public class PaymentsController {

    @Autowired
    private PaymentsService paymentsService;

    @GetMapping
    public List<Payments> getAllPayments() {
        return paymentsService.getAllPayments();
    }

    @PostMapping
    public Payments createPayment(@RequestBody Payments payments) {
        return paymentsService.createPayment(payments);
    }

    @GetMapping("/{paymentId}")
    public List<Payments> getPaymentByID(@PathVariable String paymentId) {
        return paymentsService.findPaymentById(paymentId);
    }

}
