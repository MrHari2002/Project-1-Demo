package com.revature.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component //This Class will be registered as a Spring Bean
@Entity //This Class will be created as a table in the DB (In other words, a DB ENTITY)
@Table(name = "users") //@Table lets us set properties like table name. THIS IS NOT WHAT MAKES IT A TABLE
public class User {

    @Id //This makes the field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This makes our PK auto-increment (like serial)
    private int userId;

    /* @Column isn't necessary UNLESS you want to set a name, or set constraints
       -nullable = NOT NULL constraint
       -unique = UNIQUE constraint
       -columnDefinition = lets you define more complex constraints (check, default) */

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false) //setting default role to 'user' in the no-args constructor
    private String role;

    //boilerplate----------------------------------no args, all args, getter/setter/ toString

    public User() {
        this.role = "user"; //we need this to set the default role to "user"
    }

    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
