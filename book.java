import java.util.*;
public class book{
	String title;
	String author;
	boolean isAvailable;
	public void display(){
		System.out.println("The name of the book is : "+title);
		System.out.println("The name of the author is : "+author);
		System.out.println("The book is available or not : "+((isAvailable)?"yes":"no"));
	}
	public void borrow(){
		if(isAvailable)
		{
			isAvailable = false;	
			System.out.println("The book "+title+" was borrowed ");
		}
		else{
			System.out.println("The book "+title+" is currently available ");
		}
	}
	public void returned(){
		isAvailable = true;
		System.out.println("The book "+title+" was returned ");
	}
}
