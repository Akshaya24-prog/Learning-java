package project.one;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// converting from celsius to farenheit, and farenheit to celsius
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Convert to  Celcius or Farenheit : ");
		String cf = sc.nextLine();
		
		cf = (cf.toUpperCase() == "C") ? "C" : "F";
		
		System.out.print("Enter the temperature : ");
		double temp = sc.nextDouble();
		
		double convertedTemp = (cf == "C") ? ((temp * (9/5)) + 32 ) : ((temp - 32) * (5/9));
		//cond1 -- converts from farenheit to celsius
		//cond2 -- converts from celsius to farenheit
		
		System.out.println(convertedTemp + " "+cf);
		
		
		sc.close();
		

	}

}
