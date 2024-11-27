package service;

import models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car(1, "RS1", "BMW1"));
        cars.add(new Car(2, "RS2", "BMW2"));
        cars.add(new Car(3, "RS3", "BMW3"));
        cars.add(new Car(4, "RS4", "BMW4"));
        cars.add(new Car(5, "RS5", "BMW5"));
    }

    @Override
    public List<Car> getListCarsByCount(int count) {
        if(count>=5) return new ArrayList<>(cars);
        else if (count > 0){
            return new ArrayList<>(cars.subList(0, count));
        }
        else return new ArrayList<>();
    }

}
