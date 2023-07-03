package Controller;

import Service.CarService;
import model.CarServiceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars/{id}")
    public CarServiceTable getCar(@PathVariable String VIN_code) {
        return carService.getCarsByVIN(VIN_code);
    }

    @GetMapping(value = "/cars")
    public List<CarServiceTable> findAllCars(){
        return carService.getAllCars();
    }


    @PostMapping(value = "/cars/add",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public CarServiceTable addCar(@RequestBody CarServiceTable carModel){
        return carService.addCars(carModel);
    }

    @PutMapping(value = "/cars/update")
    public CarServiceTable updateCar(@RequestBody CarServiceTable carModel){
        return carService.updateCar(carModel);
    }

}
