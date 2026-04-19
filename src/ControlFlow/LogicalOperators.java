package project.one;
import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// && = AND
		// || = OR
		// ! = NOT
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temperature (in Celsius): ");
        double temp = sc.nextDouble();

        System.out.print("Is it sunny? (true/false): ");
        boolean isSunny = sc.nextBoolean();
		
        // GOOD weather (0 to 30)
		if(temp <= 30 && temp >= 0 && isSunny) {
			System.out.println("The weather is GOOD");
			System.out.println("It is sunny outside");
		}
		else if(temp <= 30 && temp >= 0 && isSunny) {
			System.out.println("The weather is GOOD");
			System.out.println("It is cloudy outside");
		}
		// TOO HOT (using NOT + OR)
        else if (!(temp <= 30) || temp > 30) {
            System.out.println("The weather is HOT");

            if (isSunny) {
                System.out.println("It is sunny and hot");
            } else {
                System.out.println("It is cloudy but still hot");
            }
        }
		
		// TOO COLD
        else if (temp < 0) {
            System.out.println("The weather is COLD");

            if (!isSunny) {
                System.out.println("It is cold and cloudy");
            } else {
                System.out.println("It is cold but sunny");
            }
        }
		// Extra case using OR
        if (temp < 0 || temp > 35) {
            System.out.println("Extreme weather conditions!");
        }
        
        sc.close();
		
	}

}
