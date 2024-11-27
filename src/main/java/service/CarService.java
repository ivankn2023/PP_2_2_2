package service;

import models.Car;

import java.util.List;

public interface CarService {

    List<Car> getFullList();
    List<Car> getListCarsByCount(int count);

}
