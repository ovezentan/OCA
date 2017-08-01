public class Traveller extends Character { 
	public static final String DEFAULT_MSG= "Do you want to discover new countries?";
	
	public Traveller (String name, String description, int feature, char footprint){
		super(name, description, feature, footprint);
	}
	public void discoverMessage() {
		
	}
	
	public void printOtherMessage(String otherMessage) {
	    System.out.println(DEFAULT_MSG);
	}
}
