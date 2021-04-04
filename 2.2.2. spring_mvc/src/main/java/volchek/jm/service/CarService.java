package volchek.jm.service;

import volchek.jm.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList(List<Car> list, Integer count);
}
