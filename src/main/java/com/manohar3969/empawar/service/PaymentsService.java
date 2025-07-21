package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.Payments;
import com.manohar3969.empawar.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentsService {

    @Autowired
    private PaymentsRepository paymentsRepository;

    public List<Payments> getAllPayments() {
        return paymentsRepository.findAll();
    }

    public Payments createPayment(Payments payments) {
        return paymentsRepository.save(payments);
    }

    public List<Payments> findPaymentById(String paymentID) {
        return paymentsRepository.findByPaymentID(paymentID);
    }
}
