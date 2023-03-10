package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>(List.of(
            new Car("Car1", "color1", 2001),
            new Car("Car2", "color2", 2002),
            new Car("Car3", "color3", 2003),
            new Car("Car4", "color4", 2004),
            new Car("Car5", "color5", 2005)
    ));

    public List<Car> getCars(){
        return cars;
    }

    public List<Car> getCarsByCount(int count, List<Car> cars){
        if (count < 1) return null;
        if (count > 5) return cars;
        return cars.subList(0, count);
    }
}
