package com.example.security.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // Specify the table name
public class Users {

    @Id
    @Column(name = "user_id") // Maps 'id' field to 'user_id' column in the table
    private int id;

    @Column(name = "username", nullable = false, length = 50) // Maps 'username' field to 'username' column
    private String username;

    @Column(name = "password", nullable = false, length = 100) // Maps 'password' field to 'password' column
    private String password;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
