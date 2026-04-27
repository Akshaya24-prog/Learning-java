package project.three;

class library{
	String name;
	int year;
	book[] books;//library objects has 'book' objects within it 
	// Aggregation: Library HAS-A Book
	
	library(String name, int year, book[] books){
		this.name = name;
		this.year = year;
		this.books = books;
	}
	
	void displayInfo() {
		System.out.println("The "+year+" "+name);
		System.out.println("Books Available: ");
		
		for(book b: books) {// Loop through aggregated objects
			System.out.println(b.displayInfo());
		}
	}
	
}
class book{
	String title;
	int pages;
	
	book(String title, int pages){
		this.title = title;
		this.pages = pages;
	}
	
	String displayInfo() {
		return title + " (" + pages +" pages)";
	}
	
}

public class AggregationExplanation {

	public static void main(String[] args) {
		  /*
         * Aggregation:
         * A "has-a" relationship where one object contains another,
         * but the contained objects can exist independently.
         */
		
		  // Independent Book objects -- that can exist independent of the library class
		book b1 = new book("The claws",500);
		book b2 = new book("Jaws",353);
		book b3 = new book("IT",625);
		
		book[] books = {b1, b2, b3};
		
		
		//aggregation
		 // Library HAS-A collection of books
		library lib = new library("Omni books", 2001, books);
		lib.displayInfo();
	}

}
