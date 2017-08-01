package books.shelves;
import books.*;
public class BookShelves extends BookStore {
	public void addBook() {
		readBook();
		System.out.println(store);
	}
	public static void main(String[] args) {
		BookShelves bookshelves = new BookShelves();
		bookshelves.addBook();	
	}
}