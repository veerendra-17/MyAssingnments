package week1.day2;

public class Library
{
	String addBook(String bookTitle)
	{
		return bookTitle;
	}
	
	 void issueBook()
	{
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) 
	{
		Library LB = new Library();
		System.out.println(LB.addBook("Wings of Fire"));
		LB.issueBook();
		
	}
}

