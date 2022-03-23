package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsInitImpl;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @Autowired
    private CarsInitImpl carsInitImpl;

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(name = "count", required = false) Integer number, ModelMap model) {
        List<Car> carList = carsInitImpl.getCarsByParameter(number);
        model.addAttribute("cars", carList);
        return "cars";
    }
}