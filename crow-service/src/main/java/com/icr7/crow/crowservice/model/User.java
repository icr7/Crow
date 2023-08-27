package com.icr7.crow.crowservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
@Entity
@Data
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;

}
