package com.manohar3969.empawar.controller;

import com.manohar3969.empawar.model.CartItem;
import com.manohar3969.empawar.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cartitems")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return cartItemService.getAllCartItems();
    }

    @PostMapping
    public CartItem addCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.createCartItem(cartItem);
    }

    @GetMapping("/{cartItemId}")
    public List<CartItem> getCartItemById(@PathVariable String cartItemId) {
        return cartItemService.getCartListByCartId(cartItemId);
    }
}
