package com.manohar3969.empawar.repository;

import com.manohar3969.empawar.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CartRepository extends MongoRepository<Cart, String> {
    Optional<Cart> findByCartID(String cartID);
}
