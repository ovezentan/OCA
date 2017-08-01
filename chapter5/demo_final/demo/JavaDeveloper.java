public class JavaDeveloper extends Worker {
   	public JavaDeveloper(String name, String description){
		super(name, description,Character.LEARNERS);
		footprint = 'J';
	}
	public void featureForBackpacker(){
		System.out.println("This is my feature for Backpacker");
		
	}
}