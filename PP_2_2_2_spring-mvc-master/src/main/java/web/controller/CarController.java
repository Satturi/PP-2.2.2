package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private CarServiceImp carServiceImp;
    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue="5") int count, ModelMap model){
        model.addAttribute("something", "Hello, you have visited the project page 2.2.2");
        List<Car> carl = carServiceImp.carList(count);
        model.addAttribute("cars", carl);
        return "cars";
    }
}
