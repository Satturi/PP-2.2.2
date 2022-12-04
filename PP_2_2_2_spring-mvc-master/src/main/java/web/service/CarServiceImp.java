package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp implements CarService{
    
    private List<User> list;
    {
        list = new ArrayList<>();
        list.add(new User(++iD,"ABC", 123, "Nurlan"));
        list.add(new User(++iD,"AAA", 111, "Nurlan"));
        list.add(new User(++iD,"BBB", 222, "Nurlan"));
        list.add(new User(++iD,"CCC", 333, "Nurlan"));
        list.add(new User(++iD,"DDD", 444, "Nurlan"));
    }
    
    @Override
    public List<Car> carList(int count) {
        
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
