package project.one;

public class if_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if statement
		int a = 30;
		if(a>20) {
			System.out.println("a is greater than 20");	
			}
		
		
		//if-else statement
		int d = 67;
		
		
		if(d == 7) {
			System.out.println("c is equal to 7");
		}
		else {
			System.out.println("c is not equal to 7");
		}
		
		
		//if- else if - else
		int c = 45;
		if(c > 7) {
			System.out.println("c is greater than 7");
		}
		else if(c < 7) {
			System.out.println("c is less than 7");
		}
		else {
			System.out.println("c is equal to 7");
		}
		
		//nested-if
		int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Allowed");
            }
            else {
                System.out.println("ID required");
            }
        } 
        else {
            System.out.println("Not allowed");
        }
        
        //using logical operators
        //&& = AND
        // || = OR
        // ! = NOT
        int license = 22;
        boolean hasLicense = true;

        if (license >= 18 && hasLicense) {
            System.out.println("Can drive");
        }
        
        //ternary operator
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        
        //nested ternary 
        // java evaluated it from left to right
        // once a condition is true, the rest is ignored
        int marks = 97;
        String grade = 
        	(marks >= 90) ? "A":
        	(marks >= 80) ? "B":
        	(marks >= 70) ? "C":
        	(marks >= 60) ? "D":
        	(marks >= 50) ? "E": "F";
        System.out.println("Grade : "+grade);
        
        //small login system
        String username = "admin";
        String password = "1234";
        if ( username.equals("admin") && password.equals("1234")) {
        	System.out.println("Login Successful");
        }
        else {
        	System.out.println("Invalid credentials");
        }
        	
	}

}
