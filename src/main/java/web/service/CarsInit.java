package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsInit {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Niva", 4, "white"));
        cars.add(new Car("Aveo", 2, "red"));
        cars.add(new Car("Astra", 2, "black"));
        cars.add(new Car("Shuttle", 7, "blue"));
        cars.add(new Car("Transporter", 8, "greenish"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
