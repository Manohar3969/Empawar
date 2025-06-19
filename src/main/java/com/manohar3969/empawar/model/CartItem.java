package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cartItems")
@Data
public class CartItem {
    @Id
    private String cartItemID;
    private String cartItemName;
    private String cartID;
    private String cartItemQuantity;
    private String cartItemPrice;
    private String cartItemDiscount;
    private String totalItemsPrice;

    public CartItem(String cartItemID, String cartItemName, String cartID, String cartItemQuantity, String cartItemPrice, String cartItemDiscount, String totalItemsPrice) {
        this.cartItemID = cartItemID;
        this.cartItemName = cartItemName;
        this.cartID = cartID;
        this.cartItemQuantity = cartItemQuantity;
        this.cartItemPrice = cartItemPrice;
        this.cartItemDiscount = cartItemDiscount;
        this.totalItemsPrice = totalItemsPrice;
    }

    public String getCartItemID() {
        return cartItemID;
    }

    public void setCartItemID(String cartItemID) {
        this.cartItemID = cartItemID;
    }

    public String getCartItemName() {
        return cartItemName;
    }

    public void setCartItemName(String cartItemName) {
        this.cartItemName = cartItemName;
    }

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public String getCartItemQuantity() {
        return cartItemQuantity;
    }

    public void setCartItemQuantity(String cartItemQuantity) {
        this.cartItemQuantity = cartItemQuantity;
    }

    public String getCartItemPrice() {
        return cartItemPrice;
    }

    public void setCartItemPrice(String cartItemPrice) {
        this.cartItemPrice = cartItemPrice;
    }

    public String getCartItemDiscount() {
        return cartItemDiscount;
    }

    public void setCartItemDiscount(String cartItemDiscount) {
        this.cartItemDiscount = cartItemDiscount;
    }

    public String getTotalItemsPrice() {
        return totalItemsPrice;
    }

    public void setTotalItemsPrice(String totalItemsPrice) {
        this.totalItemsPrice = totalItemsPrice;
    }
}
