package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsInit;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @Autowired
    private CarsInit carsInit;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(name = "count", required = false) Integer number, ModelMap model) {
        List<Car> carList = carsInit.getCars();
        if (number != null) {
            carList = carsInit.getCars().stream().limit(number).collect(Collectors.toList());
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}