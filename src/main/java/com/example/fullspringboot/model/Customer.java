package com.example.fullspringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "name")
    public String name;

    public Customer(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Column(name = "email")
    public String email;

    @Column(name = "age")
    public String age;

}
