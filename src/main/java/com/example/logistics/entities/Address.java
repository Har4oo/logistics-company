package com.example.logistics.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "senderAddress")
    @Column(nullable = false)
    private Set<Product> sentProducts;

    @OneToMany(mappedBy = "receiverAddress")
    @Column(nullable = false)
    private Set<Product> receivedProducts;

    @OneToMany(mappedBy = "address")
    @Column(nullable = false)
    private Set<Customer> customers;

    @OneToOne(mappedBy = "address")
    private Office office;

    private String city;
    private String neighbourhood;
    private String street;

    public Address(long id, String city, String neighbourhood, String street) {
        this.id = id;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.street = street;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
