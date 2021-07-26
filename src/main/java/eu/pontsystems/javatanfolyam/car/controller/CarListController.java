package eu.pontsystems.javatanfolyam.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eu.pontsystems.javatanfolyam.car.service.CarService;

@Controller
public class CarListController {
	
	@Autowired
	private CarService cs;
	
	@GetMapping("car/list")
	public String viewList(Model model) {

		model.addAttribute("cars", cs.getAll());
		
		return "carlist";
		
	}
	
	@GetMapping("car/list/{status}")
	public String viewListWithStatus(@PathVariable("status") String status, Model model) {
		
		model.addAttribute("cars", cs.getAll());

		if(status.equals("success")) {
			model.addAttribute("status", "Sikeres mentés!");
		}
		
		if(status.equals("failed")) {
			model.addAttribute("status", "Sikertelen mentés!");
		}
		
		if(status.equals("deleted")) {
			model.addAttribute("status", "Sikeres törlés!");
		}
		
		return "carlist";
	}
	
}
