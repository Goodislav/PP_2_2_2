package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++CARS_COUNT, "Toyota Camry", 83000, 2019));
        cars.add(new Car(++CARS_COUNT, "Volkswagen Golf", 57500, 2020));
        cars.add(new Car(++CARS_COUNT, "Ford Focus", 98780, 2017));
        cars.add(new Car(++CARS_COUNT, "Geely Atlas", 61300, 2021));
        cars.add(new Car(++CARS_COUNT, "BMW M5", 37900, 2022));
    }

    @Override
    public List<Car> getCarsImpl() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCountOfCars(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}
