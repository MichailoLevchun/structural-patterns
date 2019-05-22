package main.decorator.model;

import main.decorator.service.CarService;

public class CarDecorator implements CarService {
	protected CarService car;

	public CarDecorator(CarService car) {
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}
}

