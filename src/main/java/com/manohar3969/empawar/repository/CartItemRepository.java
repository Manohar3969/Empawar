package com.manohar3969.empawar.repository;

import com.manohar3969.empawar.model.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CartItemRepository extends MongoRepository<CartItem, String> {
    List<CartItem> findByCartID(String cartId);
}
