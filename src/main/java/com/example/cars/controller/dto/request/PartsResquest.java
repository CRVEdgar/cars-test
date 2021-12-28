package com.example.cars.controller.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class PartsResquest {
    @NotNull
    private Long carId;
    @NotBlank
    private String partNumber;
    @NotBlank
    private String name;
    private Double cost;
}
