package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "cart")
@Data
public class Cart {

    @Id
    private String cartID;
    private String totalCartValue;
    private String userID;
    private List<CartItem> cartItems;

    public Cart(String cartID, String totalCartValue, String userID, List<CartItem> cartItems) {
        this.cartID = cartID;
        this.totalCartValue = totalCartValue;
        this.userID = userID;
        this.cartItems = cartItems;
    }

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public String getTotalCartValue() {
        return totalCartValue;
    }

    public void setTotalCartValue(String totalCartValue) {
        this.totalCartValue = totalCartValue;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
