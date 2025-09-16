package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("BMW", 250, false));
        cars.add(new Car("Mercedes", 220, false));
        cars.add(new Car("Tesla", 200, true));
        cars.add(new Car("Zeeker", 300, true));
        cars.add(new Car("Ferrari", 340, false));
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
