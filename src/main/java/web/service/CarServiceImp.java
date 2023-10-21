package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

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
    public List<Car> getCars(int num) {
        return this.listCars.stream().limit(num).toList();
    }

    public List<Car> getAllCars() {
        return this.listCars;
    }
}
