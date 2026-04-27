package project.three;

//POLYMORPHISM USING ABSTRACT CLASS 
abstract class vehicle{//parent class
	// Parent class (cannot be instantiated)
	abstract void go();// Abstract method - must be overridden by child classes
}

//Child class 1
class car extends vehicle{
	@Override 
	void go() {
		System.out.println("You drive the car");
	}
}

//Child class 2
class bike extends vehicle{
	@Override 
	void go() {
		System.out.println("You ride the bike");
	}
}

//Child class 3
class boat extends vehicle{
	@Override 
	void go() {
		System.out.println("You sail the boat");
	}
}


//POLYMORPHISM USING INTERFACE
interface Bakeable {// Interface = rulebook (no object creation possible)
 void bake();   // abstract method
}

//Class 1
class Cake implements Bakeable {
 @Override
 public void bake() {
     System.out.println("Baking a cake at 180°C");
 }
}

//Class 2
class Bread implements Bakeable {
 @Override
 public void bake() {
     System.out.println("Baking bread at 200°C");
 }
}

//Class 3
class Cookies implements Bakeable {
 @Override
 public void bake() {
     System.out.println("Baking cookies at 170°C");
 }
}





public class PolymorphismExplanation {

	public static void main(String[] args) {
		// polymorphism = "poly" = "many"
		//				  "morph" = "shape"
		/* objects can identify as other objects
		 * objects can be treated as objects of a common superclass  
		 * polymorphism can be achieved for parent-child classes and for interfaces */
		
		
		//---ABSTRACT CLASS POLYMORPHISM---
		car ca1 = new car();
		bike bi1 = new bike();
		boat bt1 = new boat();
		
		 // Parent reference can hold child objects
		vehicle[] array = {ca1, bi1, bt1};//to put these object in an array, the array type must be of parent class
		
		// Runtime polymorphism:
        // Java decides WHICH go() to call based on actual object
		array[0].go();//ca1.go()
		array[1].go();//bi1.go();
		array[2].go();//bt1.go();
		
		
		//---INTERFACE POLYMORPHISM ---
		Cake c1 = new Cake();
        Bread b1 = new Bread();
        Cookies ck1 = new Cookies();

     // Interface reference holding different objects
        Bakeable[] items = {c1, b1, ck1};

        // Again runtime polymorphism
        // Same method - different implementation
        items[0].bake(); //c1.go()
        items[1].bake(); //b1.go()
        items[2].bake(); //ck1.go()

	}

}

/*
 * WHY POLYMORPHISM WORKS:
 *
 * 1. Upcasting:
 *    A child object is referenced using a parent type
 *    (e.g., car -> vehicle, Cake -> Bakeable)
 *    Objects of child classes are stored in a parent reference,
 *    allowing different objects to be handled uniformly.
 *
 * 2. Method Overriding:
 *    The child class provides its own implementation of a method defined in the parent/interface
 *    each child class defines its own version of the same method.
 * 
 * 3. Dynamic Method Dispatch:
 *    The method call is resolved at runtime based on
 *    the actual object type, not the reference type
 *    Java determines which method to execute at runtime, depending on the actual object type.
 *    
 */
