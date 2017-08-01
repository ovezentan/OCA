import java.util.*;
import java.util.Random;
public class Character implements Explore { 
    /* Constant to define the maximum health value */
	public static final int MAX_HEALTH = 10;
	
	/* constants to describe possible values of Feature */
	public static final int INDEPENDENT = 5; 
	public static final int INTERACTION = 4; 
	public static final int TIME = 3; 
	public static final int LEARNERS = 2;  
	public static final int OPPORTUNITIES = 1; 
	public static final int UNDEFINED = -1; 
	
	/* constant to describe default value of footPrint */
	public static final char DEFAULT_FOOTPRINT = '+';
	
    /* variables to describe the character */
	private String name;
	private String description;
	private int feature;
	private int health;
	protected char footprint; 
	private ArrayList<Country> visitedCountries;
	
	
	/*Constructor methods*/
	public Character(String otherName, String otherDescription, int otherHealth, int otherFeature){ 
	    this.name = otherName;
	    this.description = otherDescription;
	    this.health = otherHealth;
	    setFeature(otherFeature);
	    footprint = DEFAULT_FOOTPRINT;
		visitedCountries = new ArrayList<Country>();
	    
	}
	
	public Character(String otherName, String otherDescription, int otherFeature){
	    this(otherName, otherDescription, MAX_HEALTH, otherFeature);
	}
	
	public Character(String otherName){
	    this(otherName, "Undefined description", MAX_HEALTH, UNDEFINED);
	}
	
	public Character(){
	    this("Undefined name", "Undefined description", MAX_HEALTH, UNDEFINED);
	}
	
	
	protected void addVisitedCountry(Country country) {
		visitedCountries.add(country);
	}
	
	protected void addVisitedCountries(ArrayList<Country> countries) {
		visitedCountries.addAll(countries);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDescription(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	public int getFeature(){
		return feature;
	}
	public void setFeature(int sw){
	    if(sw == INDEPENDENT || sw == INTERACTION || sw == TIME ||
	       sw == LEARNERS || sw == OPPORTUNITIES){
	       feature = sw;
	    }else{
	       feature = UNDEFINED;
	    }
	}
	//method set and get for the attribute health
	public void setHealth(int health){
		this.health = health;
	}
	public int getHealth(){
		return health;
	}
	
	public void resetHealth(){
		health=MAX_HEALTH;
	}
	
	
	public char getFootprint() {
		return footprint;
	}
	
	private Country randomVisitedCountry() {
		Random r = new Random();
		int visitedCountriesSize = visitedCountries.size();
		Country visitedCountry = null;
		if (visitedCountriesSize > 0) {
			visitedCountry = visitedCountries.get(r.nextInt(visitedCountriesSize));
		} 
		return visitedCountry;
	}
	
   	public void printInfo(){
		// String visitedCountriesNames = "";		
		// for (Country country : visitedCountries) {
			// visitedCountriesNames += country.getName();
		// }
		Country visitedCountry = randomVisitedCountry();
		String visitedCountryName = (visitedCountry == null)? "No visited country": visitedCountry.getName(); 
		String result =  
	            "*************************************"+ "\n" +  
	            "Name: " + name + "\n" +
				"Description: " + description + "\n" +
				"Feature: " + feature + "\n" +
				"Health: " + health + "\n" +
				"Is wonderer?: " + isWonderer() + "\n" + 
				"Visited country: " + visitedCountryName + "\n" +
				"Footprint: " + footprint + "\n" + 
				"*************************************";
		
		System.out.println(result);
	}
	
	public void printMessage(){
		
	}
		
	
	public boolean isWonderer(){
		return health > 0;
	}
	public void explore(Country countryToExplore, Character character) {
		character.getName();
		countryToExplore.getName();
		//Country parameter should be added to character.visitedCountries[]
		//Country.Register should get the character as a parameter and registrate the traveler
		
	}	
	
}