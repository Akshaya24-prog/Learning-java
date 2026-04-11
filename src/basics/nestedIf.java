package project.one;

public class nestedif {

	public static void main(String[] args) {
		
		//1. simple nested statement
		int num = 10;

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even Number");
            }
        }
        
        //2. slightly more complex - checks if a number is positive/negative and odd/even.
        int n = -7;

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else {
            if (n % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
        
        //3.Student Grade System
        int marks = 85;

        if (marks >= 50) {
            if (marks >= 75) {
                System.out.println("Distinction");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Fail");
        }
        
        //4. Login System
        String username = "admin";
        String password = "1234";

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Invalid Username");
        }
        
        //5. finding the largest of 3 numbers
        int a = 10, b = 25, c = 15;

        if (a > b) {
            if (a > c) {
                System.out.println("A is largest");
            } else {
                System.out.println("C is largest");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest");
            } else {
                System.out.println("C is largest");
            }
        }
        
        //6. Using boolean values - if boolean value is true, then the statement is automatically executed. There is no need to make comparison using 'variable == true'
        boolean hasHallTicket = true;
        boolean hasIDCard = false;

        if (hasHallTicket) {
            if (hasIDCard) {
                System.out.println("Allowed to write exam");
            } else {
                System.out.println("ID Card required");
            }
        } else {
            System.out.println("Hall ticket missing");
        }
        
        //7. mixed boolean + integer
        boolean isMember = true;
        int purchaseAmount = 600;

        if (isMember) {
            if (purchaseAmount > 500) {
                System.out.println("Discount Applied");
            } else {
                System.out.println("No discount");
            }
        } else {
            System.out.println("Become a member for discounts");
        }
        

	}

}
