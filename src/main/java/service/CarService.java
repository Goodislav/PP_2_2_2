package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsImpl();
    List<Car> getCountOfCars(int count);
}
