package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsInitImpl {


    private List<Car> cars = new ArrayList<>();
    private List<Car> carList = cars;

    {
        cars.add(new Car("Niva", 4, "white"));
        cars.add(new Car("Aveo", 2, "red"));
        cars.add(new Car("Astra", 2, "black"));
        cars.add(new Car("Shuttle", 7, "blue"));
        cars.add(new Car("Transporter", 8, "greenish"));
    }

    public List<Car> getCarsByParameter(Integer qty) {
        if (qty != null) {
            return carList.stream().limit(qty).collect(Collectors.toList());
        } else return cars;
    }
}
