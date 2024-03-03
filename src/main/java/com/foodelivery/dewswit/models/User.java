package com.foodelivery.dewswit.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table
@Data
public class User {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 10, message = "Имя должно быть от 2 до 100 символов")
    @Column(name = "username")
    private String  username;

    @Column(name = "password")
    private String password;

    @Column(name = "mail")
    private String mail;

    @Column(name = "role")
    private String role;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
