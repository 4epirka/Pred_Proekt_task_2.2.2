package web.services;


import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDaoImpl carDaoImpl;

    public CarServiceImpl(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @Override
    public List<Car> getCars(List<Car> unused, int count) {
        List<Car> cars = carDaoImpl.getAllCars();
        if (count <= 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
