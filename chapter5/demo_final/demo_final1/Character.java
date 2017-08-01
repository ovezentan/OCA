import java.util.*;
import java.util.Random;
public class Character implements Explorer { 
    /* Constant to define the maximum health value */
	public static final int MAX_HEALTH = 10;
	
	/* constants to describe possible values of Feature */
	public static final int INDEPENDENT = 5; 
	public static final int INTERACTION = 4; 
	public static final int TIME = 3; 
	public static final int LEARNERS = 2;  
	public static final int OPPORTUNITIES = 1; 
	public static final int UNDEFINED = -1; 
	
    /* variables to describe the character */
	private String name;
	private String description;
	private int feature;
	private int health;
	protected char footprint; 
	private List<Country> visitedCountries;
	private List<Country> exploredCountries;
	
	
	/*Constructor methods*/
	public Character(String otherName, String otherDescription, int otherFeature, char footprint){ 
	    this.name = otherName;
	    this.description = otherDescription;
	    this.health = MAX_HEALTH;
	    setFeature(otherFeature);
	    this.footprint = footprint;
		visitedCountries = new ArrayList<Country>();
		exploredCountries = new ArrayList<Country>();
	}
	
	public void addVisitedCountry(Country country) {
		visitedCountries.add(country);
	}
	
	public void addVisitedCountries(List<Country> countries) {
		visitedCountries.addAll(countries);
	}
	public void addExploredCountries(List<Country> countries) {
		exploredCountries.addAll(countries);
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
	public void setFeature(int f){
	    if(f == INDEPENDENT || f == INTERACTION || f == TIME ||
	       f == LEARNERS || f == OPPORTUNITIES){
	       feature = f;
	    }else {
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
	
   	public void printInfo() {
		Country visitedCountry = randomVisitedCountry();
		String visitedCountryName = (visitedCountry == null)? "No visited country": visitedCountry.getName(); 
		
		String resultVisitedCountries = "";
		for (Country resultVisitedCountry : visitedCountries) {
			resultVisitedCountries = resultVisitedCountries + resultVisitedCountry.getName() + " " ;
		}

		String resultExploredCountries = "";
		for (Country resultExploredCountry : exploredCountries) {
			resultExploredCountries = resultExploredCountries + resultExploredCountry.getName() + " " ;
		}
		
		String result =  
	            "*************************************"+ "\n" +  
	            "Name: " + name + "\n" +
				"Description: " + description + "\n" +
				"Feature: " + feature + "\n" +
				"Health: " + health + "\n" +
				"Is wonderer?: " + isWonderer() + "\n" + 
				"Visited countries: " + resultVisitedCountries + "\n" +
				"Explored countries: " + resultExploredCountries + "\n" +
				"Footprint: " + footprint + "\n" + 
				"*************************************";
		
		System.out.println(result);
	}
	
	public void discoverMessage() {
		
	}
	public void printOtherMessage(String otherMessage) {
	    
	}
		
	
	public boolean isWonderer(){
		return health > 0;
	}
	public void explore(Country countryToExplore) {
		exploredCountries.add(countryToExplore);
	}
	
	public void msg()throws Exception {
		System.out.println("Your desired vacation");
	}  
		
}