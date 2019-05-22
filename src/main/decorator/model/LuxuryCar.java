package main.decorator.model;

import main.decorator.service.CarService;

public class LuxuryCar extends CarDecorator {
	
	public LuxuryCar(CarService car){
		super(car);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Adding features of Luxury CarService.");
	}
}

