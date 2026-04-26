package project.three;

class Animal{
	boolean isAlive;
	
	Animal(){
		isAlive = true;
	}
	
	void eat() {
		System.out.println("The animal is eating");
	}
}

//Child class Dog
class Dog extends Animal{
	// Constructor using super
    Dog() {
        super(); // calls parent constructor
        System.out.println("Dog object created");
    }

    // Method overriding
    @Override
    void eat() {
        System.out.println("The dog is eating bones");
    }
}

//Child class Cat
class Cat extends Animal{
	// Constructor using super
    Cat() {
        super(); // calls parent constructor
        System.out.println("Cat object created");
    }

    // Method overriding
    @Override
    void eat() {
        System.out.println("The cat is eating fish");
    }
}

//Child class hyena
class hyena extends Animal{
	//despite of having no attributes or methods, it can use all attributes and methods of animal class and the object is created 
}

class Tiger extends Animal {

    Tiger() {
        super(); // calls parent constructor
        System.out.println("Tiger object created");
    }

    // No method overriding here
}

public class InheritancofClasses {

	public static void main(String[] args) {
		// Inheritance = One class inherits the attributes and methods
        //               from another class.
        // Child <- Parent
		
		// Creating objects
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        hyena h1 = new hyena();
        Tiger t1 = new Tiger();

        // Calling methods
        d1.eat();   // overridden
        c1.eat();   // overridden
        h1.eat();   // inherited from Animal
        t1.eat();   // inherited from Animal

		
		
	}

}

/*
 i)the keyword '@Override'
 '@Override' is not mandatory in Java.
 The program will work even without it.

 However, it is recommended because:
 1. It helps catch errors (e.g., wrong method name or signature).
 2. It ensures that the method actually overrides a parent class method.
 3. It improves code readability by clearly showing overriding.

 In short: not required, but good practice to use. 
 
 *
 *
 *
 ii)'super' refers to the parent (superclass) object.
 It is used to:
 1. Call the parent class constructor -> super();
 2. Access parent class variables -> super.variableName;
 3. Call parent class methods -> super.methodName();

	super() must be the FIRST statement inside a constructor.
	If not written explicitly, Java automatically calls the parent constructor.
	It is useful when the child class wants to reuse or extend the parent class behavior.
  */
