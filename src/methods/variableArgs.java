package project.two;

public class variableArgs {

	public static void main(String[] args) {

        // allow a method to accept a varying number of arguments
        // makes methods more flexible, no need for overloaded methods
        // Java will pack the arguments into an array
        // ... (ellipsis)

		System.out.println("Sum of the elements : "+add(1, 2, 4));
		System.out.printf("Average of the elements : %.2f \n", average(1, 2, 3, 4, 5, 6));
		System.out.printf("Average of the elements : %.2f \n", average());
    }

     static int add(int...numbers ) {//accepts any number of int arguments
        System.out.println(numbers);//prints the memory address of the array
        
        //summing the elements of the array
        int sum = 0;
        for(int i = 0 ; i < numbers.length ; i++) {
        	sum += numbers[i];
        }
        return sum;
    }
     
     static double average(double...numbers) {
    	 
    	 double sum  = 0;
    	 
    	 if(numbers.length == 0) {
    		 return 0;
    	 }
    	 
    	 for(double number : numbers ) {
    		 sum += number;
    	 }
    	 return (sum/numbers.length);
     }
     /*
      * Instead of several different overloaded methods that can do the same thing, only one method is required
      *
    static double add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    static double add(int a, int b, int c, int d, int e ) {
        return a + b + c + d + e;
    }

	*/
    
    

}
