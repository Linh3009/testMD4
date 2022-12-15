package com.example.codegym.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Tên không để trống")
    private String name;
    @Pattern(regexp = "^[1-9]+[0-9]*$", message = "Diện tích là số lớn hơn 0")
    private String area;
    @Pattern(regexp = "^[1-9]+[0-9]*$", message = "Dân số là số lớn hơn 0")
    private String population;
    @Pattern(regexp = "^[1-9]+[0-9]*$", message = "GDP là số lớn hơn 0")
    private String gdp;

    private String description;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;


}
