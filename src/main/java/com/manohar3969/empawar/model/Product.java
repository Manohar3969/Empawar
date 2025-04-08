package com.manohar3969.empawar.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
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
}