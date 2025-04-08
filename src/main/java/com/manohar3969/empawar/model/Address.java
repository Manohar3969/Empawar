package com.manohar3969.empawar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "address")
@Data
public class Address {
    @Id
    private String addressID;
    private String addressStreet1;
    private String addressStreet2;
    private String addressCity;
    private String addressState;
    private String addressZipCode;
    private String userId;
}
