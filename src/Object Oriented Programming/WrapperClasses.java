package project.three;

public class WrapperClassesExplanation {
	
	//1. default values (class-level variables)
	static int a0;        // primitive - default 0
	static Integer b0;    // wrapper - default null

	public static void main(String[] args) {
		
		// default values demonstration
		System.out.println(a0); // 0 (default for int)
		System.out.println(b0); // null (default for Integer)
		
		// Wrapper classes = Allow primitive values (int, char, double, boolean)
		//to be used as objects. "Wrap them in an object"
		//Generally, don't wrap primitives unless you need an object.
		//Allows use of Collections Framework and static Utility Methods.

		//2. AutoBoxing - wrapping up a primitive within an object
		Integer a = 123;
		Double b = 3.14;
		Character c = 'S';
		Boolean d = true;
		String e = "Burgers";//string is often  created this way
		
		//3. Unboxing - taking a primitive in an object and unwrapping it
		int x = a;
		double y = b;
		char z = c;
		boolean w = d;
		
		//4. converting a primitive to string
		//this is done by wrapping the primitive data into an object and converting it to a string
		String s1 = Integer.toString(123);//converts the number 123 (an int) into a String.
		String s2 = Character.toString('S');
		String s3 = Double.toString(3.15);
		String s4 = Boolean.toString(true);
		String S = s1 + s2 + s3 + s4;
		System.out.println(S);//concatenates the strings
		
		//5. converting Strings to primitive datatypes
		//to convert string to primitive data type - This does the reverse of toString()
		int p1 = Integer.parseInt("234");// Converts String to int
		// Throws NumberFormatException if the String is not a valid integer
		
		double p2 = Double.parseDouble("1.618");// Converts String to double
		// Throws NumberFormatException if invalid
		
		char p3 = "Burgers".charAt(0);//characters do not have a parse method
		// Gets a single character from a String (no parse method for char)
		// charAt(index) returns the character at that position (0 = first character)

		boolean p4 = Boolean.parseBoolean("true");// Converts String to boolean
		// Returns true only if the String is "true" (case-insensitive), otherwise false
		/*
		 * Boolean.parseBoolean("TRUE") → true
		 * Boolean.parseBoolean("yes")  → false
		 */
		
		
		//6. Character methods
		char letter = 'S';
		System.out.println(Character.isLetter(letter));
		//returns true if character is a letter
		//false if the character is not a letter
		
		//to check upper case
		System.out.println(Character.isUpperCase(letter));
		//returns true if it is uppercase
		//false if it is lowercase
		
		char ch = '7';
		System.out.println(Character.isLetter(ch));        // false
		System.out.println(Character.isDigit(ch));         // true
		System.out.println(Character.isLetterOrDigit(ch)); // true
		System.out.println(Character.toUpperCase(letter));     // remains the same
		System.out.println(Character.getNumericValue(letter)); //28 -> unicode of 'S'
		System.out.println(Character.getNumericValue(ch));     // 7
		System.out.println(Character.toLowerCase(letter));// 'S' -> 's'
		
		//7. converting strings to objects
		Integer obj1 = Integer.valueOf("123");
		Double obj2 = Double.valueOf("3.67");
		Character obj3 = Character.valueOf("Burgers".charAt(0));
		Boolean obj4 = Boolean.valueOf("true");
		
		
	
		//8. null objects
		Integer num1 = null;   // Wrapper can be null
        
        // int num2 = num1;       //  This will throw NullPointerException
		
		
		//9. comparing wrapper objects
		Integer ax = 100;
        Integer bx = 100;

        System.out.println(ax == bx);      // true (cached values)
        System.out.println(ax.equals(bx)); // true

        Integer xa = 1000;
        Integer xb = 1000;

        System.out.println(xa == xb);      // false ❗ (different objects)
        System.out.println(xa.equals(xb)); // true
        
        

		
	}

}
