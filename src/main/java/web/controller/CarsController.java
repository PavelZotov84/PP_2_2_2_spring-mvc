package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCarsOfCount(Model model, @RequestParam(value = "count", required = false) String i) {
        CarService service = new CarServiceImpl();
        List<Car> tableCars = (i == null) ?
                service.listCars() : service.getCars(service.listCars(), Integer.parseInt(i));
        model.addAttribute("cars", tableCars);
        return "cars";
    }
}



