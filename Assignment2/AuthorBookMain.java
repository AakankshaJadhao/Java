/*Create a class Book with instance variables 
title, author, and price. Write a parameterized constructor to 
initialize these variables. Write a method displayBookDetails() 
that prints the book details. Create an object of the 
Book class using the constructor and display its details.*/
package Assignment2;
class AuthorBook{
	String title,author;
	Double price;
	
	AuthorBook(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayBookDetails() {
		System.out.println("Title="+title+"\tAuthor="+author+"\tPrice="+price);
	}
}
public class AuthorBookMain {

	public static void main(String[] args) {
		AuthorBook b=new AuthorBook("Ugly love","Connon Hover",450);
		b.displayBookDetails();
		
	}

}
