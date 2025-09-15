package web.services;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(List<Car> carList, int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        }
        return carList.subList(0, count);
    }

}
