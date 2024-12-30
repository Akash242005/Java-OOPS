import java.util.*;
public class library{
	public static void main(String[] args){
		book book1 = new book();
		book book2 = new book();
		book1.title = "java";
		book1.author = "Charles";
		book1.isAvailable = true;
		book2.title = "C++";
		book2.author = "Mark";
		book2.isAvailable = true;
		book1.display();
		book2.display();
		book1.borrow();
		book1.display();
		book1.returned();
		book1.display();
	}
}
//THE CLASS BOOK IS IN book.java file
