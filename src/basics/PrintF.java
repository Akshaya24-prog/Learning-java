package project.one;

public class PrintF {

	public static void main(String[] args) {
		//printf() is a method used to format output
		
		String name = "Ryland Grace";
		char score = 'A';
		int age = 36;
		double height = 180;
		boolean isEmployed = true;
		long distance = 12345098L;
		
		
		//newline statement '\n' is added so that the next statement is not printed in the same line.
		//inserting a string
		System.out.printf("Hello %s \n", name);
		
		//inserting a char
		System.out.printf("Your score is %c \n", score);
		
		//inserting an int
		System.out.printf("You are %d years old \n", age);
		
		//inserting a double -- %f can be used for float and double
//to set limit to the number of decimal places displayed, use: %.xf . Where x is the number of decimal places that need to be displayed.
		System.out.printf("Your height is %.2f cm tall", height);//here only 2 decimal places would be displayed 

		//inserting boolean
		System.out.printf("Employed : %b \n ", isEmployed);
		
		
		//inserting 2 variables
		System.out.printf("%s is %d miles away from home\n", name, distance);// %d is used to cast long
	
	
		//other formatting methods
		
		
		System.out.println();
		System.out.println("Other formatting methods");
		double cost1 = 9.99;
		double cost2 = 67.15;
		double cost3 = -55.55;
		
		//+ : output a plus
		System.out.println("+ : output a plus");
		System.out.printf("%+.2f\n",  cost1);
		System.out.printf("%+.2f\n",  cost2);
		System.out.printf("%+.2f\n",  cost3);
		
		// , : comma grouping seperator
		System.out.println(", : comma grouping seperator");
		System.out.printf("%,.2f\n",  cost1);
		System.out.printf("%,.2f\n",  cost2);
		System.out.printf("%,.2f\n",  cost3);
		
		// ( : negative numbers aare enclosed in()
		System.out.println("( : negative numbers aare enclosed in()");
		System.out.printf("%(.2f\n",  cost1);
		System.out.printf("%(.2f\n",  cost2);
		System.out.printf("%(.2f\n",  cost3);
		
		// space = display a minus is negative, space if positive
		System.out.println("space : display a minus is negative, space is positive");
		System.out.printf("% .2f\n",  cost1);
		System.out.printf("% .2f\n",  cost2);
		System.out.printf("% .2f\n",  cost3);
		
		System.out.println();
		System.out.println("width formatting :- ");
		
		int id1 = 9;
		int id2 = 45;
		int id3 = 678;
		int id4 = 1231;
		//zero padding the values '%0xd' - it is formatted such that the total field width is 4. 
		//If it is not 4, zeros fill up the preceeding spaces to make the field width 4.
		System.out.println("zero padding the values : ");
		System.out.printf("%04d\n", id1);
		System.out.printf("%04d\n", id2);
		System.out.printf("%04d\n", id3);
		System.out.printf("%04d\n", id4);
		
		//padding with space -- right justified values
		System.out.println("space padding the values (right justified) : ");
		System.out.printf("%4d\n", id1);
		System.out.printf("%4d\n", id2);
		System.out.printf("%4d\n", id3);
		System.out.printf("%4d\n", id4);
		
		//left justified padding for negative numbers
		System.out.println("zero padding the values (left justified) : ");
		System.out.printf("%-4d\n", id1);
		System.out.printf("%-4d\n", id2);
		System.out.printf("%-4d\n", id3);
		System.out.printf("%-4d\n", id4);

	}

}
