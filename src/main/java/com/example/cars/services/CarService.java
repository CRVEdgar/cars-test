package com.example.cars.services;

import com.example.cars.controller.dto.request.CarRequest;
import com.example.cars.controller.dto.request.PartsResquest;
import com.example.cars.controller.dto.response.CarResponse;
import com.example.cars.controller.dto.response.PartsResponse;
import com.example.cars.core.Converter;
import com.example.cars.entities.Car;
import com.example.cars.entities.PartsCar;
import com.example.cars.repository.CarRepository;
import com.example.cars.repository.PartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private PartsRepository partsRepository;

    @Autowired
    private Converter converterService;

    public List<CarResponse> findAllCar(){
        List<Car> cars = carRepository.findAll();
        return converterService.fromListModelToResponse(cars);
    }

    public List<PartsResponse> findAllCarParts(Long cardId){
        List<PartsCar> parts = partsRepository.findByCarId(cardId);
        return converterService.fromListModelToPartsResponse(parts);
    }

    @Transactional
    public CarResponse addCAr(CarRequest request){
        Car carSave = carRepository.save(
                converterService.fromCarRequest(request)
        );

        return converterService.fromModelToCarResponse(carSave);
    }

    @Transactional
    public PartsResponse addParts(PartsResquest request){
        PartsCar parts = partsRepository.save(
                converterService.fromPartsRequest(request)
        );

        return converterService.fromModelToPartsResponse(parts);
    }
}
