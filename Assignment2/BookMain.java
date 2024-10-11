package Assignment2;
class Book 
{
	String title,author;
	double price;
	
	public Book(String title, String author, double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void show()
	{
		//System.out.println("Title = "+title+"\tAuthor = "+author+"\tPrice= "+price);
		System.out.println("Title=" + title);
        System.out.println("Author=" + author);
        System.out.println("Price=" + price);
	}
}


public class BookMain {

	public static void main(String[] args) {
		Book b=new Book("Dear Stranger I know how you feel","Asish Bhagreja",450);
		b.show();
	}

}
