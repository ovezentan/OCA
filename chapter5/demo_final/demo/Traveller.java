public class Traveller extends Character { 
	public static final String DEFAULT_MSG = "Do you want to discover Netherlands?";
	
	public Traveller (String name, String description, int feature){
		super(name, description,feature);
	}
	public void printMessage(){
		System.out.println(DEFAULT_MSG);
	}
	
	public void printMessage (String otherMessage){
	    System.out.println(otherMessage);
	}
}
