public class MovieTrivia extends MovieCharacter implements Actor, Doctor, FamousMovie {
	private String firstName = "Bill";
	
	
	MovieTrivia() {
		super(66);
	}
	public String getFirstName(){
		return "Bill";
	}
	public String getLastName(){
		return "Murray";
	}
	
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}

	public double rating = 7.80;
	
}