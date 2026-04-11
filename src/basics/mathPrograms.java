package project.one;
import java.util.Scanner;

public class MathClassExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//finding hypotenuse c 
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Enter height of triangle : ");
		a = sc.nextDouble();
		System.out.print("Enter lenght of the base of the triangle : " );
		b = sc.nextDouble();
		System.out.println(); //this statement is added so that the output is printed in the next line
		
		c = Math.sqrt(Math.pow(a, 2)+Math.pow(b,  2));
		System.out.println("The length of hypotenuse c is : "+c);
		
		
		System.out.println(); //this statement is added so that the output is printed in the next line
		//finding circumference and area for a circle of given radius
		double r, area, circumference;
		System.out.print("Enter the radius of the circle : ");
		r = sc.nextDouble();
		
		area = (Math.PI) * (Math.pow(r,  2));
		circumference = 2 * (Math.PI) * r;
		
		System.out.println(); //this statement is added so that the output is printed in the next line
		System.out.printf("The circumference of the circle is  : %.2f"+circumference);
		System.out.printf("The area of the circle is : %.2f"+area);
				
		/*System.out.printf() id java's formatted printing method. 
		 * It is similar to System.out.println(), but has placeholders for variables.
		 * here we use %.2f as a placeholder for a double or float value. It displays numbers with exactly 2 decimal places*/
		
		sc.close();

	}

}
