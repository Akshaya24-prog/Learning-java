package project.one;
import java.util.Scanner;

public class CountDown {

	public static void main(String[] args)throws InterruptedException { //Declares that this method(main) may throw an InterruptedException
		//An exception is thrown when something goes wrong at runtime
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many seconds to count down from ? : ");
		int start = sc.nextInt();
		
		for(int i = start ; i > 0 ; i -- ) {
			System.out.println(i);
			Thread.sleep(1000); //Thread.sleep(1000) → Pauses execution for 1000 milliseconds (1 second).
		}
		System.out.println("HAPPY NEW YEAR !!!");
		sc.close();
	}

}
