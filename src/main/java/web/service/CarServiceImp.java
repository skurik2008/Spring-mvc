package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> listCars;

    public CarServiceImp() {
        listCars = new ArrayList<>();
        listCars.add(new Car("Nissan", "Quashqai", 2008));
        listCars.add(new Car("Mazda", "626", 2010));
        listCars.add(new Car("Audi", "Q8", 2019));
        listCars.add(new Car("KIA", "Sorento", 2015));
        listCars.add(new Car("BMW", "X6", 2020));
    }
    @Override
    public List<Car> getCars(Integer num) {
        if (num == null) {return this.listCars;}
        return this.listCars.stream().limit(num).toList();
    }
}
