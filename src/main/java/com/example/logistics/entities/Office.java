package com.example.logistics.entities;

import javax.persistence.*;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(nullable = false, unique = true)
    private Address address;
}
