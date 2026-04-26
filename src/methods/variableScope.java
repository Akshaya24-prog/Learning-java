package project.two;

public class variableScope {
	
	static int x = 3;//class scope

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x = 1;//local variable – accessible only within the main() method
		
		System.out.println(x);//prints 1 because the local variable x hides the class variable
		methodA();//calls methodA(), which prints its own local variable x = 2
		System.out.println(variableScope.x);//prints 3 because we are explicitly accessing the class variable
		
		{
			System.out.println("\n inside a block : ");
		    int y = 5;
		    System.out.println(x); // can access x from main() (outer scope)
		    System.out.println(y); // prints the assigned y value
		}
		System.out.println("\n outside the block : ");
		System.out.println(x); // prints 1 (local variable in main)
		//System.out.println(y); //  ERROR
	}
	
	static void methodA() {
		int x = 2;//local variable – accessible only within methodA()
		System.out.println(x);
	}

}
