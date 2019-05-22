package main.facade.marketshapes;

import main.facade.model.Circle;
import main.facade.model.Rectangle;
import main.facade.service.ShapeService;
import main.facade.model.Square;

public class ShapeMaker {
	private ShapeService rectangle;
	private ShapeService square;
	private ShapeService circle;

	public ShapeMaker() {
		rectangle = new Rectangle();
		square = new Square();
		circle = new Circle();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

	public void drawCircle() {
		circle.draw();
	}
}
