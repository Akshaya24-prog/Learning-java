package project.three;

public class OOP2 {

	public static void main(String[] args) {
		
		// Creating objects using different constructors
		StudentX student1 = new StudentX("Ash", 19, 9.1);// full constructor
		StudentX student2 = new StudentX("Ruby", 19, 8.99 );// full constructor
		StudentX student3 = new StudentX();// default constructor
		StudentX student4 = new StudentX("Anna"); // name-only constructor
		
		// Printing student1 details
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gpa);
		System.out.println(student1.isEnrolled);
		student1.study();
		
		// Printing student2 details
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.gpa);
		System.out.println(student2.isEnrolled);	
		student2.study();
		
		// Printing student3 details (default values)
		System.out.println(student3.name);
		System.out.println(student3.age);
		System.out.println(student3.gpa);
		System.out.println(student3.isEnrolled);
		
		// Printing student4 details (partial values)
		System.out.println(student4.name);
		System.out.println(student4.age);
		System.out.println(student4.gpa);
		System.out.println(student4.isEnrolled);
		
		
	}

}
