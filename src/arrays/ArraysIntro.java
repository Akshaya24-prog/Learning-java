package project.two;
import java.util.Arrays; //importing arrays class to perform operations on an array
public class ArraysProgram {

	public static void main(String[] args) {
		// arrya = a collection of values of the same data type
		// it is a variable that can store more than one value
		
		//1. creating an array
		String[] fruits = {"mango", "apple",  "banana", "orange"};
		
		//2. printing the data
		System.out.println(fruits);//unlike primitive data types, this prints the memory address, because arrays are reference data types
		System.out.println(fruits[0]);//prints the object at index 0(first element)
		System.out.println(fruits[1]);//prints the object at index 1(second element)
		//when user tries to access an element that does not exist-- like fruits[6], an ArrayIndexOutOfBounds Exception is thrown
		
		//3. changing the value of an object
		//value of an object can be changed at a specific index
		System.out.println("Before change : "+fruits[3]);
		fruits[3] = "pomegranate"; 
		System.out.println("After change : "+fruits[3]);
		/* fruits[4] = "pineapple";
		*This line does not give a compile-time error because the syntax is correct.
		*However, at runtime Java checks whether index 4 exists in the array.
		*The array 'fruits' has size 4, so valid indices are 0 to 3.
		*Since index 4 is out of bounds, Java throws an ArrayIndexOutOfBoundsException when the program runs.
		*/
		
		//4. finding the length of an array
		int numOfFruits = fruits.length;//gives the length of the array
		System.out.println("The length of the array is  : "+numOfFruits);
		
		//5. sorting an array
		Arrays.sort(fruits);
		
		
		// 6. An enhanced for loop (for-each loop) - mostly used to iterate arrays
		// Syntax: for(dataType variable : array)
		// 'fruit' is a temporary variable that takes each element from the array one by one.
		// 'fruits' is the array being traversed.
		// In each iteration, 'fruit' stores the next element, and it is printed.
		System.out.println("\nIterating through elements of the array");
		for(String fruit: fruits ) {
			System.out.println(fruit );
		}
		
		//7. fill method - replacing each element with pineapple
		Arrays.fill(fruits, "pineapple");
		System.out.println("\nThe list after replacement");
		for(String fruit: fruits ) {
			System.out.println(fruit );
		}
	
	}

}
