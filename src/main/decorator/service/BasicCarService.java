package main.decorator.service;

public class BasicCarService implements CarService {
	
	@Override
	public void assemble() {
		System.out.println("Basic CarService.");
	}

}
