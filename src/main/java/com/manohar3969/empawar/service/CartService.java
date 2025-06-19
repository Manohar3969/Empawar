package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.Cart;
import com.manohar3969.empawar.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCartList() {
        return cartRepository.findAll();
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Optional<Cart> getCartById(String orderId) {
        return cartRepository.findByCartID(orderId);
    }

}
