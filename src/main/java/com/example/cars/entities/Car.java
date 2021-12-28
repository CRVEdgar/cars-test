package com.example.cars.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "tbl_car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String make;
    private String model;
    private int yearCar;

    @OneToMany(mappedBy = "car")
    private List<PartsCar> parts = new ArrayList<>();

    public Car() {
    }

    public Car(String make, String model, int yearCar) {
        this.make = make;
        this.model = model;
        this.yearCar = yearCar;
    }
}
