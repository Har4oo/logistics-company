package com.example.logistics.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int phoneNumber;

    @OneToMany(mappedBy = "sender")
    @Column(name = "sender_id",nullable = false)
    private Set<Product> senderProducts;

    @OneToMany(mappedBy = "receiver")
    @Column(name = "receiver_id",nullable = false)
    private Set<Product> receiverProducts;

    @ManyToOne
    private Address address;

    public Customer(long id, String name, int phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
