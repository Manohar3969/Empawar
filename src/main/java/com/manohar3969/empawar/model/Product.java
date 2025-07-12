package com.manohar3969.empawar.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
public class Product {
    @Id
    private String productId;

    @NotNull(message = "Product Name should not be blank")
    @Size(min = 2, max = 100, message = "Product Name must be between 2 and 100 characters")
    private String productName;

    @NotNull(message = "Product Description should not be blank")
    private String productDescription;

    @NotNull(message = "Product Price should not be blank")
    @Min(value = 0, message = "Price must be greater than or equal to 0")
    private double productPrice;

    @NotNull(message = "Product Category should not be blank")
    private String productCategory;

    @NotNull(message = "Product Stock should not be blank")
    @Min(value = 0, message = "Product Stock should be greater than or equal to 1")
    private int productStock;

    private String productImage;

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}