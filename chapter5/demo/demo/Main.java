public class Main {
	public static void main(String[] args) {
		MovieTrivia movietrivia = new MovieTrivia();
		Character character = movietrivia;
		MovieCharacter moviecharacter = movietrivia;
		Actor actor = movietrivia;
		Doctor doctor = movietrivia;

		System.out.println("The character is from a fiction movie? " +character.isFiction());
		moviecharacter.displayMovieCharacterDetails();
		System.out.println("and " + movietrivia.rating + " rating points on IMDB ");
		System.out.println("The actor is " + actor.getFullName());
		System.out.println("The movie is " + FamousMovie.getMovieName());
		System.out.println("The character played by " + actor.getFullName() + " in " + FamousMovie.getMovieName()+" is "+ Doctor.getCharacterName());
	}
}