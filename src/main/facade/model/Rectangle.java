package main.facade.model;

import main.facade.service.ShapeService;

public class Rectangle implements ShapeService {
	
	@Override
	public void draw(){
		System.out.println("Rectangle drawing.");
	}
}

