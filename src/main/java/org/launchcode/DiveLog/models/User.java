package org.launchcode.DiveLog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=20, message = "Name must be between 3 and 20 characters")
    private String username;

    @NotNull
    @Size(min=3, max=30, message= "Email must be between 3 and 30 characters")
    private String email;


    @NotNull
    @Size(min=5, max=10, message = "Password must be between 5 and 10 characters")
    private String password;


    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = id;
    }
    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId(){
        return id;
    }
}
