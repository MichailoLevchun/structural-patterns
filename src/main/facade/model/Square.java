package main.facade.model;

import main.facade.service.ShapeService;

public class Square implements ShapeService {
	
	@Override
	public void draw(){
		System.out.println("Square drawing.");
	}
}

