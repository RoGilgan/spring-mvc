package volchek.jm.service;

import volchek.jm.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCar(List<Car> list, Integer count);
}
