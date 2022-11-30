package web.service;

import web.model.Car;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> carList(int count) {
        List<Car> list = new  ArrayList<>();
        list.add(new Car("ABC", 123, "Nurlan"));
        list.add(new Car("AAA", 111, "Nurlan"));
        list.add(new Car("BBB", 222, "Nurlan"));
        list.add(new Car("CCC", 333, "Nurlan"));
        list.add(new Car("DDD", 444, "Nurlan"));

        List<Car> carList = new  ArrayList<>();
        int p = count;
        if (0 > count || count > 5) {
            p = 5;
        }
        for (int i = 0; i < p; i++) {
            carList.add(list.get(i));
        }
        return carList;
    }
}
