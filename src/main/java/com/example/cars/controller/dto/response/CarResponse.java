package com.example.cars.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarResponse {

    private Long id;
    private String make;
    private String model;
    private int year;
}
