package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCarsByCount(ModelMap modelMap, @RequestParam(name = "count") int count){
        List<Car> cars = carService.getCars();
        modelMap.addAttribute("carsByCount", carService.getCarsByCount(count, cars));
//        cars.forEach(System.out::println);
        return "cars";
    }
}
