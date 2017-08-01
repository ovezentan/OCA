import java.util.*;
public class Main {
     private static ArrayList<Character> createCharacters() {
		ArrayList<Character> characterList = new ArrayList<>();
		characterList.add(new Character("John", "An independent person of 23 years. " + "\n" + "The hero of this story", Character.INDEPENDENT));
		characterList.add(new HolidayTourist("Anna the Holiday Tourist", "She travels only during holidays"));
        characterList.add(new Nomad("George the nomad", "He loves adventures"));
		characterList.add(new Backpacker("Nick the backpacker", "He likes the hotel under the stars"));       
		characterList.add(new FrontEndDeveloper("Eve the Front End Developer", "She likes working on challenging projects"));
		characterList.add(new Employee("Peter the employee", "He wish to travel more."));
        characterList.add(new JavaDeveloper("Mike the Java Developer", "He is currently learning for his certification."));  
		return characterList;
	}
	
	private static ArrayList<Country> createCountries() {
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(new Country("Netherlands"));
		countries.add(new Country("Spain"));
		countries.add(new Country("Italy"));
		countries.add(new Country("Germany"));
		return countries;
	}
	
	public static void main(String[] args){
		ArrayList<Character> characterList = createCharacters();
		ArrayList<Country> countries = createCountries();
        
		for (Character character : characterList) {
			Country country = new Country("Belgium");
			character.addVisitedCountries(countries);
			character.printInfo();
			character.printMessage();
			character.explore(country,character);
			
		}
		
		
	    
		System.out.println("All exploring: hero, Holiday Tourist, nomad, backpacker, Front-End Developer, employee, Java Developer");
	}
	
}
