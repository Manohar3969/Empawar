package com.manohar3969.empawar.service;

import com.manohar3969.empawar.model.CartItem;
import com.manohar3969.empawar.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public CartItem createCartItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getCartListByCartId(String cartId) {
        return cartItemRepository.findByCartID(cartId);
    }
}
