package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Toyota Prius", "Red", 1.8));
        cars.add(new Car("Audi A6", "Yellow", 2.4));
        cars.add(new Car("Dodge RAM", "Black", 5.7));
        cars.add(new Car("BMW 520i", "Silver", 3.0));
        cars.add(new Car("MB E200", "Blue", 2.0));
    }


    @Override
    public List<Car> showCars(int count) {
        if (count >= 1 & count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;
    }
}
