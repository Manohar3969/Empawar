package com.manohar3969.empawar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Document(collection = "orders")
@Data
public class Order {
    @Id
    private String orderId;
    private String userId;
    private String orderPrice;
    private String addressID;
    private Date deliveryDate;
    private Date orderDate;
    private String orderStatus;
    private List<String> orderItems;
}
