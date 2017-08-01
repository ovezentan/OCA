 public class Employee extends Worker {
    public Employee(String name, String description){
		super(name, description,Character.OPPORTUNITIES, 'E');
	}
	public void discoverMessage() {
		System.out.println("Opportunities is my feature for Nomad");
		
	}

}