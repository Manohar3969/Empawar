package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
@Data
public class Product {

    @Id
    private String productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private String productCategory;
    private int productStock;
}