package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarService carService = new CarServiceImp();

    @GetMapping()
    public String printCarsCount(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("cars", carService.getAllCars());
        } else {
        model.addAttribute("cars", carService.getCars(count));
        }
        return "Cars";
    }
}
