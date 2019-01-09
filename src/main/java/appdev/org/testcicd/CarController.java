package appdev.org.testcicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import appdev.org.testcicd.CarRepository;
import appdev.org.testcicd.Car;



@Controller
@RequestMapping(path="/api/car")
public class CarController {
	
	@Autowired
	private CarRepository carRepository;

	// save new car 
	@GetMapping(path="add")
	public @ResponseBody String addNewCar(
			@RequestParam String name, 
			@RequestParam String color ){

		Car car = new Car();
		car.setName(name);
		car.setColor(color);
		carRepository.save(car);
		return "saved";
	}

	// get all car
	@GetMapping(path="all")
	public @ResponseBody Iterable<Car> getAllUsers(){
		return carRepository.findAll();
	}
}

