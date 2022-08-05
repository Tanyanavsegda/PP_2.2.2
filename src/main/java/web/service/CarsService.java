package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsService {

    private List<Car> cars;

    public CarsService() {
        cars = new ArrayList<>();
        cars.add(new Car("m1", 700000, "T1"));
        cars.add(new Car("m2", 500000, "T2"));
        cars.add(new Car("m3", 800000, "T3"));
        cars.add(new Car("m4", 900000, "T4"));
        cars.add(new Car("m5", 760000, "T5"));
    }

    public List<Car> getSomeCars(int size) {
        if (size >= 5) return cars;
        List<Car> someCars =  cars.stream().limit(size).collect(Collectors.toList());
        return someCars;
    }
}
