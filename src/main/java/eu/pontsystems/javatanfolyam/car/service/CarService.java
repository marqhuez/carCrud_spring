package eu.pontsystems.javatanfolyam.car.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.javatanfolyam.car.entity.Car;
import eu.pontsystems.javatanfolyam.car.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository cr;
	
	public List<Car> getAll() {
		return cr.findAll();
	}
	
	public void saveCar(Car carObj) {
		cr.save(carObj);
	}

	public Car getCar(Long id) {
		return cr.getById(id);
	}

	public void deleteCar(Car carObj) {
		cr.deleteById(carObj.getId());
	}

	public List<Car> getAllVeteran() {
		
		Integer veteranYear = Calendar.getInstance().get(Calendar.YEAR) - 30;

		return cr.findByGyartasiEvLessThanEqual(veteranYear);
	}
	
}
