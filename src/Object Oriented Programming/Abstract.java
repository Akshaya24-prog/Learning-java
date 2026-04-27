package project.three;

abstract class shape{
	abstract double area();
	
	void display() {//concrete method
		System.out.println("This is a shape");
	}
}
class circle extends shape{
	double radius;
	
	circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double area() {//overriding the abstract method 'area' from parent class
		return Math.PI * radius * radius;
	}
	
}
class triangle extends shape{//overriding the abstract method 'area' from parent class
	double height;
	double base;
	
	triangle(double height, double base){
		this.height = height;
		this.base = base;
	}
	
	@Override
	double area() {
		return 0.5 * base * height;
	}
	
}
class rectangle extends shape{//overriding the abstract method 'area' from parent class
	double length;
	double breadth;
	
	rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	double area() {
		return length * breadth ;
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		/**
		 * The 'abstract' keyword is used to define abstract classes and methods.
		 * 
		 * Abstraction is the process of hiding implementation details
		 * and showing only the essential features.
		 * 
		 * Key points about abstract classes:
		 * - Abstract classes CAN'T be instantiated directly.
		 * - Can contain 'abstract' methods (which must be implemented by subclasses).
		 * - Can contain 'concrete' methods (which are inherited by subclasses).
		 */
		
		//shape s1 = new shape(); 
		//it is not possible to directly create an object for abstract class
		//the object must be created with the name of the sub-class
		
		circle c1 = new circle(3);
		triangle t1 = new triangle( 4, 5);
		rectangle r1 = new rectangle(6, 7);
		c1.display();
		System.out.println(c1.area());
		t1.display();
		System.out.println(t1.area());
		r1.display();
		System.out.println(r1.area());
		
		

	}

}
