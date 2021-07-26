package eu.pontsystems.javatanfolyam.car.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.pontsystems.javatanfolyam.car.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	List<Car> findByGyartasiEvLessThanEqual(Integer veteranYear);

}
