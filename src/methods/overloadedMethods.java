package project.two;

public class overloadedMethods {

	public static void main(String[] args) {
		
		//overloaded methods - Overloaded methods are methods with the same name but different parameter lists (different number, type, or order of parameters).

		//overloaded method add
		System.out.println(add(1, 2));//1st instance has 2 parameters
		System.out.println(add(1, 2, 3));//2nd instance has 3 parameters
		System.out.println(bakePizza("flat bread"));
		System.out.println(bakePizza("flat bread", "mozzarella"));
		System.out.println(bakePizza("flat bread", "mozzarella", 3));
	}
	
	//Overloaded versions of the add() method
	static double add(double a, double b){// takes double parameters (int values are automatically promoted to double)
		return a + b;
	}
	
	static double add(int a, int b, int c){// takes three int parameters
		return a + b + c;
	}
	
	//Overloaded versions of the bakePizza() method
	static String bakePizza(String bread) {
		return bread+" pizza";
	}
	static String bakePizza(String bread, String cheese) {
		return cheese+" "+bread+" pizza";
	}
	static String bakePizza(String bread, String cheese, int qty) {
		return cheese+" "+bread+" pizza"+" ; quantity : "+qty;
	}

}
