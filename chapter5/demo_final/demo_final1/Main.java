import java.util.*;

public class Main {
	public static void main(String[] args){
		List<Character> characterList = createCharacters();
		List<Country> countries = createCountries();
		for (Character character : characterList) {
			character.addVisitedCountries(countries);
			character.addExploredCountries(countries);
			character.printInfo();
			character.discoverMessage();
			character.printOtherMessage("Welcome");
			try {  
				character.msg();  
			}catch(Exception e){
				System.out.println("exception");
			}  
			
		}
		
	
	}
	
     private static List<Character> createCharacters() {
		List<Character> characterList = new ArrayList<>();
		characterList.add(new Character("John", "An independent person of 23 years. " + "\n" + "The hero of this story", Character.INDEPENDENT, '+'));
		characterList.add(new HolidayTourist("Anna the Holiday Tourist", "She travels only during holidays"));
        characterList.add(new Nomad("George the nomad", "He loves adventures"));
		characterList.add(new Backpacker("Nick the backpacker", "He likes the hotel under the stars"));       
		characterList.add(new FrontEndDeveloper("Eve the Front End Developer", "She likes working on challenging projects"));
		characterList.add(new Employee("Peter the employee", "He wish to travel more."));
        characterList.add(new JavaDeveloper("Mike the Java Developer", "He is currently learning for his certification."));  
		return characterList;
	}
	
	private static List<Country> createCountries() {
		List<Country> countries = new ArrayList<Country>();
		countries.add(new Country("Netherlands"));
		countries.add(new Country("Spain"));
		countries.add(new Country("Italy"));
		countries.add(new Country("Germany"));
		return countries;
	}
	
	    
}
