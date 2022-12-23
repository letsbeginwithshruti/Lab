/*Problem 3.
Program to create library book Management system
to store and display book details in library where you can create two classes one is main another one is library, where 
you can create two methods as addBook,dispanseBook and bookId,bookName,bookAuthor as instance variables*/

package pack.com;

class Library{//sub class
	private  int bookID;//creating instance variables
	private String bookName;
	private String bookAuthor;
	
	public  void add_book(int bookID,String bookName,String bookAuthor) {//method add_book
		this.bookID=bookID;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;}
	void dBook(String name) //method to show book id,name,author name
	{
		
			System.out.println("Book id:"+bookID+"\nBook name:"+bookName+"\nBook author="+bookAuthor);
		
	}}
	public class Library_main {
	public static void main(String[] args) {//main method
		Library l=new Library();//creating object
		Library l1=new Library();//creating object
		l.add_book(134563, "Ramayana", "Balmiki");
		l1.add_book(102567, "Pagla Dasu", "Rita Agarwal");
		l.dBook("Mahabharat");
		l1.dBook("Bengali 1st");
		l1.dBook("Best english grammer");
	}
	}