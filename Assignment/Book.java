/*Create a class Book with instance variables 
title, author, and price. Write a parameterized constructor to 
initialize these variables. Write a method displayBookDetails() 
that prints the book details. Create an object of the 
Book class using the constructor and display its details.*/
package Assignment;
public class Book {
	String title,author;
	double price;
	
	public Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;		
	}	
	void displayBookDetails()
	{		
		System.out.println("Book detail is as follow:");
		System.out.println("Title="+title+"\tAuthor="+author+"\tPrice="+price);

	}	
}
