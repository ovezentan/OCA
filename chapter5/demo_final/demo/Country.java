public class Country {
	private String name;
	
	
	public Country(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
	public void print(char footprint){
		setFootprint(footprint);
	}
	
	private void setFootprint(char footprint){
		 //return footprint;
	}
	public void registerTraveler(Character character){
		//Put the character in the list of people who visited the country
	}

}