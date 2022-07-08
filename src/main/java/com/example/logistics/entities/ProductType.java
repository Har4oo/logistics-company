package com.example.logistics.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;

    @OneToMany(mappedBy = "productType")
    @Column(nullable = false)
    private Set<Product> product;

    public ProductType(long id, String type) {
        this.id = id;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
