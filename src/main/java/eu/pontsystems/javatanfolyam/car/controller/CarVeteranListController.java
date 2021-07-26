package eu.pontsystems.javatanfolyam.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import eu.pontsystems.javatanfolyam.car.service.CarService;

@Controller
public class CarVeteranListController {
	
	@Autowired
	private CarService cs;
	
	@GetMapping("car/veteranlist")
	public String viewVeteranList(Model model) {
		
		model.addAttribute("cars", cs.getAllVeteran());
		
		return "veteranlist";
		
	}
	
}
