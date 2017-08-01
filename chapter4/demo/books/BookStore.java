package books;
public class BookStore {
	protected String store = "Docker";
	protected void readBook() {
		System.out.println(store);
	}
	public static void main(String[] args) {
		BookStore obj = new BookStore();
		obj.readBook();	
	}
}