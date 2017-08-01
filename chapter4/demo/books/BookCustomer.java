package books;
import books.shelves.Book;
public class BookCustomer {
	public void buyList() {
		BookStore bookstore = new BookStore();
		bookstore.readBook();
		bookstore.print();
		System.out.println(bookstore.store);
		System.out.println(bookstore.raiting + "" +bookstore.title + "" + bookstore.genre + "");
	}
	public static void main(String[] args) {
		BookCustomer customer = new BookCustomer();
		customer.buyList();	
	}	
}
