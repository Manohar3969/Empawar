package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cartItems")
@Data
public class CartItem {
    @Id
    private String cartItemID;
    private String cartID;
    private String cartItemName;
    private String cartItemQuantity;
    private String cartItemCostPrice;
    private String cartItemSellingPrice;
    private String cartItemDiscount;
    private String cartItemSize;
    private String cartItemTotalPrice;
    private String cartItemImage;

    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
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

    public String getCartItemQuantity() {
        return cartItemQuantity;
    }

    public void setCartItemQuantity(String cartItemQuantity) {
        this.cartItemQuantity = cartItemQuantity;
    }

    public String getCartItemCostPrice() {
        return cartItemCostPrice;
    }

    public void setCartItemCostPrice(String cartItemCostPrice) {
        this.cartItemCostPrice = cartItemCostPrice;
    }

    public String getCartItemSellingPrice() {
        return cartItemSellingPrice;
    }

    public void setCartItemSellingPrice(String cartItemSellingPrice) {
        this.cartItemSellingPrice = cartItemSellingPrice;
    }

    public String getCartItemDiscount() {
        return cartItemDiscount;
    }

    public void setCartItemDiscount(String cartItemDiscount) {
        this.cartItemDiscount = cartItemDiscount;
    }

    public String getCartItemSize() {
        return cartItemSize;
    }

    public void setCartItemSize(String cartItemSize) {
        this.cartItemSize = cartItemSize;
    }

    public String getCartItemTotalPrice() {
        return cartItemTotalPrice;
    }

    public void setCartItemTotalPrice(String cartItemTotalPrice) {
        this.cartItemTotalPrice = cartItemTotalPrice;
    }

    public String getCartItemImage() {
        return cartItemImage;
    }

    public void setCartItemImage(String cartItemImage) {
        this.cartItemImage = cartItemImage;
    }
}
