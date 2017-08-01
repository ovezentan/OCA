public class FrontEndDeveloper extends Worker {
    public FrontEndDeveloper(String name, String description){
		super(name, description,Character.INTERACTION);
		footprint = 'F';
	}
	public void printMessage(){
		System.out.println("This is my feature for Holiday Tourist");
	}
}