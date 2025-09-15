package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.services.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", 250, false));
        carList.add(new Car("Mercedes", 220, false));
        carList.add(new Car("Tesla", 200, true));
        carList.add(new Car("Zeeker", 300, true));
        carList.add(new Car("Ferrari", 340, false));

        if (count == null) {
            model.addAttribute("carList", carList);
        } else {
            model.addAttribute("carList", carService.getCars(carList, count));
        }

        return "cars";
    }
}


//git init
//git add
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/4epirka/Pred_Proekt_task_2.2.2.git
//git push -u origin main