package project.one;

public class mathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Value of PI : "+Math.PI);
		System.out.println("Euler's number : "+Math.E);
		
		//power method
		double result;
		result = Math.pow(2,3); // 2 raised to the power of 3(2^3)
		System.out.println("2^3 = "+result);
		double IntegerDiv = Math.pow(2,  3.0/2); //using 3/2 would give 1
		System.out.println("2^(3/2) = "+IntegerDiv);
		
		//absolute value method 
		double absolute;
		absolute = Math.abs(-5);
		System.out.println("|-5| = "+absolute);
		
		//square root
		double squareRoot;
		squareRoot = Math.sqrt(4);
		System.out.println("SquareRoot(4) = "+squareRoot);
		double negativeSquareRoot;
		negativeSquareRoot = Math.sqrt(-4);//returns NaN - not an error. NaN stands for Not a Number
		System.out.println("SquareRoot(-4) = "+negativeSquareRoot);
		
		//round method - round off a number to the nearest whole integer
		long roundOff; //it is initialized as long because Math.round() returns long data type
		roundOff = Math.round(9.6);
		System.out.println("Rounding off 9.6 =  "+roundOff);
		
		//ceiling method
		double ceiling;
		ceiling = Math.ceil(44.6);
		System.out.println("ceil(44.6) = "+ceiling);
		
		//floor method
		double floorMethod;
		floorMethod = Math.floor(44.6);
		System.out.println("floor(44.6) = "+floorMethod);
		
		// find maximum value between 2 variables
		double maximum; // can be an integer or double
		maximum = Math.max(10, 20);
		System.out.println("maximum of 10 and 20 = "+maximum);
		
		// find minimum value between 2 variables
		double minimum; // can be an integer or double
		minimum = Math.min(10, 20);
		System.out.println("minimum of 10 and 20 = "+minimum);
		
		//sin, cos, tan values(These use radians, NOT degrees)
		
		//when radians are used
		System.out.println("sin(pi/2) = "+Math.sin(Math.PI / 2)); // 1.0
		System.out.println("cos(0) = "+Math.cos(0));           // 1.0
		System.out.println("tan(pi/4) = "+Math.tan(Math.PI / 4)); // 1.0
		
		//when degrees are used
		System.out.println("sin(90) = " +Math.sin(Math.toRadians(90)));
		
		//logarithmic functions
		System.out.println("log(10) = "+Math.log(10));    // natural log (ln)
		System.out.println("log10(100) = "+Math.log10(100)); // base 10 log
		
		//random number - similar to Random.nextDouble()
		System.out.println("Random number between 0.0 and 0.99 = "+Math.random());
		
		//exponential
		System.out.println("e^2 = "+Math.exp(2));
		
		//signum function
		// -1.0 for -ve values, 1.0 for +ve values, and 0 for 0.
		System.out.println("signum[-5] = "+Math.signum(-5));
		
		//copysign - it transfers the sign
		//Math.copySign(a, b) returns the value of a with the sign of b.
		double copySign = Math.copySign(5, -0.0); 
		System.out.println("Math.copysign(5, -0.0) = "+copySign);
	}

}
