package encap.run;
import encap.*;
public class BookShelves {
	public static void main(String... args) {
		final Book book1 = new Book("OCA", "Science" , 4);
		final Book book2 = new Book();
		book2.setTitle("DesignPatterns");
		book2.setRating(5);
		book2.setGenre("Science");
		String text = book1.toString();
		String text2 = book2.toString();
		System.out.println(text);
		System.out.println(text2);
	}
}