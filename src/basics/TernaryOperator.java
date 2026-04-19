package project.one;

public class ternaryOperator {

	public static void main(String[] args) {
		
	// ternary operator ? = Return 1 of 2 values if a condition is true
		
	// variable  = (condition) ? ifTrue : ifFalse;
		
		int score = 70;
		
		if(score >= 60) {
			System.out.println("Win");	
		}
		else {
			System.out.println("Lose");
		}
		
		//another way to write the if-else condition is the ternary operator
		String WinOrLose = (score >= 60) ? "Win" : "Lose";
		System.out.println("You "+WinOrLose);
		
		//to check if a number is even or odd
		int number = 5;
		String EvenOrOdd = ((number % 2) == 0) ? "Even" : "Odd";
		System.out.println("The number is "+EvenOrOdd);
		
		//calculating taxrate
		int income = 100000;
		double taxRate = (income >= 40000) ? 0.25 : 0.15;
		System.out.println("Tax Rate is "+taxRate);
		
		
		
	}

}
