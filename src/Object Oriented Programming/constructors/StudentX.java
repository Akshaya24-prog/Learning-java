package project.three;

public class StudentX {// This class represents a Student
	
	 // Variables (attributes) of the student
	String name;
	int age;
	double gpa;
	boolean isEnrolled;
	
	 // Constructor:
    // A constructor is a special method that is called when an object is created
    // It has the same name as the class and is used to initialize values
    StudentX(String name,int age,double gpa ){
    	 // 'this' refers to the current object
        // It helps distinguish between instance variables and parameters
		this.name = name;  // assign parameter 'name' to object's 'name'
		this.age = age;    // assign parameter 'age' to object's 'age'
		this.gpa = gpa;    // assign parameter 'gpa' to object's 'gpa'
		this.isEnrolled = true; //// assign parameter true to object's 'isEnrolled'
		
	}
    
    
    //overloading of constructors
    
 // Default constructor (no arguments)
    // Used when no values are provided during object creation
    StudentX(){
    		// Assigning default values manually
            this.name = "Unknown"; //the default value would be null, if the value is not explicitly assigned
            this.age = 0;
            this.gpa = 0.0;
            this.isEnrolled = false;
    		};
    
  //an object can be created with the name alone
    StudentX(String name){
    	this.name = name; 
    	
    	// Providing default values for remaining fields(not necessary)
        this.age = 0;
        this.gpa = 0.0;
        this.isEnrolled = true;
    	}
    
 // Method to simulate studying
    void study() {
    	System.out.println(name + " is studying");//the previously initialized name at the constructors in used
    }
	


}
