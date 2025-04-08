package com.manohar3969.empawar.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
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
