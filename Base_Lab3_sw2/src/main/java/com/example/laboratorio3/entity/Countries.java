package com.example.laboratorio3.entity;

import javax.persistence.*;
@Table(name = "countries")

public class Countries {
    @Id
    private Integer country_id;

    @Column(name = "country_name")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;


}
