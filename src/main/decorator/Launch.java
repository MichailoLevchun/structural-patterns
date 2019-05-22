package main.decorator;

import main.decorator.model.LuxuryCar;
import main.decorator.model.SportsCar;
import main.decorator.service.BasicCarService;
import main.decorator.service.CarService;

public class Launch {

	public static void main(String[] args) {
		CarService basicCar = new BasicCarService();
		CarService sportsCar = new SportsCar(basicCar);
		CarService sportsLuxuryCar = new SportsCar(new LuxuryCar(basicCar));
		basicCar.assemble();
		System.out.println("//////////////////////////////////////////////////");
		sportsCar.assemble();
		System.out.println("//////////////////////////////////////////////////");
		sportsLuxuryCar.assemble();
	}
}
