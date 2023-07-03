package reposytory;

import model.CarServiceTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarServiceTable, Long> {
    CarServiceTable findCarServiceTableByVIN_code(String VIN_code);

    CarServiceTable findCarById(Long id);

    @Override
    List<CarServiceTable> findAll();
}
