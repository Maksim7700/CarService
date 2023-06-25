package reposytory;

import model.CarServiceTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarServiceTable, Long> {
}
