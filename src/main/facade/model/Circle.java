package main.facade.model;

import main.facade.service.ShapeService;

public class Circle implements ShapeService {
	
	@Override
	public void draw(){
		System.out.println("Circle drawing.");
	}
}

