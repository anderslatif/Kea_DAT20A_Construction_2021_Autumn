package com.example.prices_stores.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="prices")
@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double price;

    @Column
    private double priceOfPrice;

    @Column
    private String size;

    @Column
    private String color;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;


}
