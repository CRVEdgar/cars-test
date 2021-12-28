package com.example.cars.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PartsResponse {

    private Long carId;
    private String partNumber;
    private String name;
    private Double cost;
}
