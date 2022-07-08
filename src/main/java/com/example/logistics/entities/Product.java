package com.example.logistics.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    private double weight;

    @ManyToOne
    private Customer sender;

    @ManyToOne
    private Customer receiver;

    @ManyToOne
    private Address senderAddress;

    @ManyToOne
    private Address receiverAddress;

    @ManyToOne
    private ProductType productType;

    @ManyToOne
    @JoinColumn(nullable = false)
    private ProductStatus productStatus;

    @ManyToOne
    @JoinColumn(nullable = false)
    private DeliveryTime deliveryTime;

    public Product(long id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
