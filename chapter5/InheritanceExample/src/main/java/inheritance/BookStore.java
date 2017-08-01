package main.java.inheritance;

public class BookStore {
	public static void main(String[] args) {
		Book book = new Book();
		BookShelves bookShelves = new BookShelves();
		Customer customer = new Customer();
		
		System.out.println();
		
		book.isBestSeller();
		book.isOnDiscount();
		
		bookShelves.isBestSeller();
		bookShelves.isOnDiscount();
		
		customer.isBestSeller();
		customer.isOnDiscount();
		
		Book a1 = new Customer();
		Book a2 = new BookShelves();
		
		a1.isBestSeller();
		a2.isOnDiscount();
	}
}
