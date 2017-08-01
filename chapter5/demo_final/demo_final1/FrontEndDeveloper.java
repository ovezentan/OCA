public class FrontEndDeveloper extends Worker {
    public FrontEndDeveloper(String name, String description){
		super(name, description,Character.INTERACTION, 'F');
	}
	public void discoverMessage() {
		System.out.println("Interaction is my feature for Holiday Tourist");
	}
}