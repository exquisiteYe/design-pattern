package xyDemo.dto;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private long id;
    private String telephone;

    public User(){}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
