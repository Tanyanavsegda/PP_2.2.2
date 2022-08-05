package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsService carsDAO;

    @Autowired
    public CarsController(CarsService carsDAO) {
        this.carsDAO = carsDAO;
    }
    @GetMapping()
    public String showAllCars(@RequestParam(value = "count", defaultValue = "5") int size, Model model) {
        model.addAttribute("allCars", carsDAO.getSomeCars(size));
        return "cars";
    }


}
