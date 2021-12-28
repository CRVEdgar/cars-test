package com.example.cars.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_parts")
@NoArgsConstructor
@Data
public class PartsCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long carId;
    private String partNumber;
    private String name;
    private Double cost;

    @ManyToOne
    @JoinColumn(name = "car")
    private Car car;

    public PartsCar(Long carId, String partNumber, String name, Double cost) {
        this.carId = carId;
        this.partNumber = partNumber;
        this.name = name;
        this.cost = cost;
    }
}
