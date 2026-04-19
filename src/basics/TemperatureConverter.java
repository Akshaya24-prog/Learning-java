package project.one;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// converting from celsius to farenheit, and farenheit to celsius
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Convert to  Celcius or Farenheit : ");
		String cf = sc.nextLine();
		
		cf = (cf.toUpperCase().equals("C")) ? "C" : "F";
		
		System.out.print("Enter the temperature : ");
		double temp = sc.nextDouble();
		
		double convertedTemp = cf.equals("C") 
                ? (temp - 32) * (5.0 / 9)     // F → C
                : (temp * (9.0 / 5)) + 32;   // C → F
		
		System.out.printf("%.2f %s", convertedTemp, cf);
		
		
		sc.close();
		

	}

}
