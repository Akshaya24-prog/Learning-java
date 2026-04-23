package project.one;
import java.util.Random;
import java.util.Scanner;


public class numberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//number guessing game
		
		//an object of class Random is created
		// the reason we don't directly use Random.nextInt(...) for randomNumber is because, nextInt() is not static.
		//It requires a real object to work with, it cannot work with a class directly.
		Random random = new Random(); 
		Scanner sc = new Scanner(System.in);
		
		int guess;
		int attempts = 0;
		int a = 1;
		int b = 100;
		int randomNumber = random.nextInt(a, b +1 );//integers from 1 to 10
		//System.out.println(randomNumber);
		
		System.out.println("Number guessing game : ");
		System.out.printf("Guess a number between %d-%d \n", a, b);
		
		do {
			System.out.print("Enter a guess : ");
			guess = sc.nextInt();
			attempts++;
			if(guess < randomNumber) {
				System.out.println("The number is less than the random number ");
			}
			else if(guess > randomNumber) {
				System.out.println("The number is greater than the random number ");
			}
			else {
				System.out.println("You have won !!!");
				System.out.println("The number was : "+randomNumber);
				System.out.printf("It took %d attempts",attempts);
			}
		}while(guess != randomNumber);
		
		
		sc.close();
	}

}
