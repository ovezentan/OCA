package books.shelves;
import books.*;
public class Book {
	private String title;
	private String genre;
	private int raiting;
	
	
	public Book(int raiting) {
		this(raiting,"Science");
	}
	public Book(int raiting,String title) {
		this(raiting,title,"Science");
	}
	
	public Book(int raiting,String title,String genre) {
		this.raiting = raiting;	
		this.title = title;
		this.genre = genre;
		
	}
	public void print() {
		System.out.println(raiting + "" + title + "" + genre + "");
	}
	public static void main(String[] args) {
		Book book = new Book(15, "DesignPatterns","Science");
		book.print();
	}
}