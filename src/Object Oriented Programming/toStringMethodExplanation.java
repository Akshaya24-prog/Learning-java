package project.three;

class CarV{
	
	String make;
	String model;
	int year;
	String color;
	
	CarV(String make, String model, int year, String color){
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	@Override
	public String toString() {// This returns a readable description of the object
		return color + " " + year + " "+ make + " " + model ;

	}
}


public class toStringMethodExplanation {

	public static void main(String[] args) {
		// .toString() = Method inherited from the Object class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code(memory address) as a unique identifier, as it is a reference type object
        // It can be overridden to provide meaningful details.
		
		CarV car1 = new CarV("Ford", "Mustang", 2026, "white");
		CarV car2 = new CarV("Chevrolet", "Corvette", 2026, "Blue");
		
		// When you print an object:
        // Java automatically calls the toString() method
		System.out.println(car1);// calls car1.toString()
		System.out.println(car2);// calls car2.toString()
		
		// Because we overrode toString(), this will NOT print memory location.
        // Instead, it prints the formatted string we defined.
	}

}
