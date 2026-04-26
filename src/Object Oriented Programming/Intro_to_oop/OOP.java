package project.three;

public class OOP {

	public static void main(String[] args) {
		// Object - AN entity that holds data(attributes)
		//it can perform actions(methods)
		//it is a reference data type(like strings)

		Car car = new Car(); //creating a new object named car, type of the object is Car
		car.price = 450000; // changing the attributes
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.price);
		
		System.out.println(car.isRunning);
		car.start();
		car.drive();
		car.brake();
		System.out.println(car.isRunning);
		car.stop();
		
		Car car2 = new Car();
		//the drawback of this class Car is that all objects will have fixed attributes
		System.out.println(car.make + " "+ car.model);
		System.out.println(car2.make + " "+ car2.model);
	}
	

}
