package com.manohar3969.empawar.repository;

import com.manohar3969.empawar.model.Payments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentsRepository extends MongoRepository<Payments, String> {
    List<Payments> findByPaymentID(String paymentID);
}
