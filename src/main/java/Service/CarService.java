package Service;

import model.CarServiceTable;
import org.springframework.stereotype.Service;
import reposytory.CarRepository;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarServiceTable getCarsByVIN(String VIN_code){
        return carRepository.findCarServiceTableByVIN_code(VIN_code);
    }

    public List<CarServiceTable> getAllCars(){
        return carRepository.findAll();
    }

    public CarServiceTable addCars(CarServiceTable carServiceTable){
        return carRepository.save(carServiceTable);
    }

    public CarServiceTable updateCar(CarServiceTable newCar){
        CarServiceTable car = getCarById(newCar.getId());
        updateCar(newCar, car);
        carRepository.save(car);
        return newCar;
    }

    private CarServiceTable getCarById(Long id) {
        return carRepository.findCarById(id);
    }

    private static void updateCar(CarServiceTable newCar, CarServiceTable car) {
        car.setBrand(newCar.getBrand());
        car.setModel(newCar.getModel());
        car.setGraduation_year(newCar.getGraduation_year());
        car.setPrice(newCar.getPrice());
        car.setColor(newCar.getColor());
        car.setType_engine(newCar.getType_engine());
        car.setVIN_code(car.getVIN_code());
    }

}
