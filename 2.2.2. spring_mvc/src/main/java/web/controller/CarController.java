package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                         ModelMap model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, "black"));
        cars.add(new Car("Mazda", 2, "blue"));
        cars.add(new Car("Mercedes",3, "white"));
        cars.add(new Car("Toyota", 4, "yellow"));
        cars.add(new Car("Mitsubishi", 5, "red"));
        model.addAttribute("cars", cars.stream().limit(count).collect(Collectors.toList()));

        return "cars";
    }
}
