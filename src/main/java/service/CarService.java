package service;

import model.Car;
import java.util.List;

public interface CarService {
    public List<Car> getCars(List<Car> list, int val);

    public List<Car> listCars();
}
