package com.manohar3969.empawar.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String userID;
    private String userFirstName;
    private String userLastName;
    private String userEmailID;
    private String userMobileNumber;
    private String userRole;
}
