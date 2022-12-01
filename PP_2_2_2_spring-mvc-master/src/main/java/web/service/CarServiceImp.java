package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp implements CarService{
    @Override
    public List<Car> carList(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("ABC", 123, "Nurlan"));
        list.add(new Car("AAA", 111, "Nurlan"));
        list.add(new Car("BBB", 222, "Nurlan"));
        list.add(new Car("CCC", 333, "Nurlan"));
        list.add(new Car("DDD", 444, "Nurlan"));

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
