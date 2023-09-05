package service;
import model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> getCars(List<Car> list, int val) {
        List<Car> cars = new ArrayList<>();
        if (val > 5) {
            return list;
        } else {
            for (int i = 0; i < val; i++) {
                cars.add(list.get(i));
            }
            return cars;
        }
    }

    public List<Car> listCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car(234, "Lada", "red"));
        list.add(new Car(567, "Reno", "black"));
        list.add(new Car(12, "Mazda", "white"));
        list.add(new Car(45, "Kia", "blue"));
        list.add(new Car(539, "Opel", "green"));
        return list;
    }
}
