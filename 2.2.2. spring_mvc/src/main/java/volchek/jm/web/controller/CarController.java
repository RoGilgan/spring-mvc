package volchek.jm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import volchek.jm.model.Car;
import volchek.jm.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                         Model model) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, "black"));
        cars.add(new Car("Mazda", 2, "blue"));
        cars.add(new Car("Mercedes",3, "white"));
        cars.add(new Car("Toyota", 4, "yellow"));
        cars.add(new Car("Mitsubishi", 5, "red"));
        model.addAttribute("cars", carService.getCar(cars, count));

        return "cars";
    }
}
