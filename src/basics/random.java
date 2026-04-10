package project.one;
import java.util.Random; //import Random class

public class random {

	public static void main(String[] args) {
		
		
		Random random = new Random(); 
		
		// any integer
		int a;
		a = random.nextInt();
		System.out.println(a); // 0 to a-1
		
		// random integer within range
		int b;
		b = random.nextInt(1, 10); // 1 to 9
		System.out.println(b);
		
		//random double (only from 0 to 1)
		double c;
		c = random.nextDouble();
		System.out.println(c);
		
		//random boolean 
		boolean d;
		d = random.nextBoolean(); //true or false
		System.out.println(d);
		
		//random long
		long e;
		e = random.nextLong(); //(from -9,223,372,036,854,775,808  to  9,223,372,036,854,775,807)
		System.out.println(e);
		//bounded random long
		long boundedLong = random.nextLong(100L, 500L); // Between 100 (inclusive) and 500 (exclusive)
		System.out.println(boundedLong);
		
		
		//random float
		float f;
		f = random.nextFloat(); // from 0.0f to 1.0f -- includes 0, but never reaches 1.0
		System.out.println(f);
		
		//random Gaussian
		//since it follows a normal distribution(a bell curve), most of its values lie between -3 and +3
		double g;
		g = random.nextGaussian(); // from negative infinity to positive infinity
		System.out.println(g);
		
	}

}
