package project.two;

public class Methods {
	/*Syntax for method : 
	  access_modifier static return_type method_name(parameters) {
    	// method body
    	// code
    	return value; // (only if return_type is not void)
	}
	
	keywords:
	1. access_modifier controls visibility(public, private, protected, default)
	2. static - belongs to a class, can be called without an object
	   non-static method : no object id required to call it
	3. return type - what type of object the method returns(int, double, String, void)
	4. Method_name - any valid identifier. It must not be a keyword.
	5. parameters - values passed to the function. These values will be used by the function.
	6. return - the keyword the marks the end of a function
	 
	  */
	
	static void greet() {
		System.out.println("Hello World!!");
	}
	
	static void happyBirthday(String name, int age) {//the string name is passed as a parameter
		System.out.printf("Happy Birthday %s \n",name);
		System.out.printf("You are %d years old !\n", age);
		System.out.println("Hope you have a great day !!!");
	}
	
	static double cube(double number) {
		double result = number * number * number;
		return result;
	}
	static String getFullName(String name1, String name2) {
		return name1+" "+name2;
	}
	static Boolean ageCheck(int age) {
		if (age > 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		// a method is a block of reusable code that is executed when you call it
		
		greet();
		
		happyBirthday("Sam", 19);
		happyBirthday("Steve", 20);
		
		System.out.println(cube(4));
		
		System.out.println("The full name is : "+getFullName("Harry","Potter"));
		
		if(ageCheck(21)) {
			System.out.println("ELigible to get a license");
		}
		else {
			System.out.println("Not eligible to get a license");
		}
	}
}
