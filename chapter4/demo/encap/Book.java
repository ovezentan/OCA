package encap;
public class Book {
	
	private String title;
	private String genre;
	private int rating;
	
	public Book() {}

	public Book(String titleBook, String genreBook, int ratingBook){
		this.title = titleBook;
		this.genre = genreBook;
		this.rating = ratingBook;
	}
	
	
	public int getRating() {
		return rating;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public void setRating( int newRating) {
		rating = newRating;
	}

	public void setTitle(String newTitle) {
		title = newTitle;
	}

	public void setGenre( String newGenre) {
		genre = newGenre;
	}
	
	@Override
	public String toString() {
		return "Title : " + title + " Rating : " + rating + " Genre : " + genre;
	}	
}