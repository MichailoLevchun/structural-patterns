package main.decorator;

public class Launch {

	public static void main(String[] args) {
		Car basicCar = new BasicCar();
		Car sportsCar = new SportsCar(basicCar);
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(basicCar));
		basicCar.assemble();
		System.out.println("//////////////////////////////////////////////////");
		sportsCar.assemble();
		System.out.println("//////////////////////////////////////////////////");
		sportsLuxuryCar.assemble();
	}
}
