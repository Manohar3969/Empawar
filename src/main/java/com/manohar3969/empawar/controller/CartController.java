package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.Cart;
import com.manohar3969.empawar.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getAllCartItems() {
        return cartService.getAllCartList();
    }

    @PostMapping
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.createCart(cart);
    }

    @GetMapping("/{cartId}")
    public Optional<Cart> getCartById(@PathVariable String cartId) {
        return cartService.getCartById(cartId);
    }
}
