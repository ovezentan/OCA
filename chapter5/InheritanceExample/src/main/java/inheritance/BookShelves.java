package main.java.inheritance;

public class BookShelves extends Book {
	public BookShelves() {
		super();
		System.out.println("A new BookShelf has been created!");
	}
	
	@Override
	public void isBestSeller() {
		System.out.println("A bookshelf has bestsellers books");
	}
		
	@Override
	public void isOnDiscount() {
		System.out.println("A bookshelf has books on discount");
		
	}
}
