 public class Employee extends Worker {
    public Employee(String name, String description){
		super(name, description,Character.OPPORTUNITIES);
		footprint = 'E';
	}
	public void featureForNomad(){
		System.out.println("This is my feature for Nomad");
		
	}

}