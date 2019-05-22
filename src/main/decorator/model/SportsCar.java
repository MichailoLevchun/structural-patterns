package main.decorator.model;

import main.decorator.service.CarService;

public class SportsCar extends CarDecorator {
	
	public SportsCar(CarService car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports CarService.");
	}
}
