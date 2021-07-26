package eu.pontsystems.javatanfolyam.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eu.pontsystems.javatanfolyam.car.entity.Car;
import eu.pontsystems.javatanfolyam.car.service.CarService;

@Controller
public class CarNewController {
	
	@Autowired
	CarService cs;
	
	@GetMapping("car/new")
	public String viewNewCar(Model model) {
		
		return "newcar";
		
	}
	
	@PostMapping("car/new")
	public String saveNewCar(Car carObj) {
		
		if(carObj.getRendszam().equals("") || carObj.getGyartasiEv() == null) {
			return "redirect:/car/list/failed";
		}
		
		cs.saveCar(carObj);
		
		return "redirect:/car/list/success";
	}
	
}
