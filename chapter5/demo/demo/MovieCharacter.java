public class MovieCharacter extends Character {
	private int numberOfScenes;
	private int appearance;
	public MovieCharacter(int age) {
		super(age);
		this.numberOfScenes = 400;
		this.appearance = 400;
	}
	public void displayMovieCharacterDetails() {
		System.out.print("Movie character with age: " +getAge());
		System.out.print(" and "+appearance+" appearances in the movie");
		System.out.print(" with "+numberOfScenes+" scenes ");	
	}
	
}