package com.example.prices_stores.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name="stores")
@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String owner;

    @Column
    private String storeName;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @Column
    @Enumerated(value = EnumType.STRING)
    private CountryOfOrigin madeIn;

    @JsonManagedReference
    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Price> prices;

}
