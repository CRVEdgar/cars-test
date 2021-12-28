package com.example.cars.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class CarRequest {
    @NotBlank
    private String make;
    @NotBlank
    private String model;
    @NotNull
    private int year;

    private String partNumber;
    private String name;
    private Double cost;
}
