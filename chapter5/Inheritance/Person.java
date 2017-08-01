public abstract class Person {
	String name;
	String address;
	
    public Person(String name, String address){
	    this.name = name;
	    this.address = address;
	}
	
	
	public String getName(){
	    return name;
	}
	
	
	public String getAddress(){
	    return address;
	}
	
	public void setAddress(String address){
	    this.address = address;
	}
	
	
	@Override
	public String toString() {
      return "Person[" + super.toString() +",name" + name + ",address=" + address +"]";   
	}
	public boolean isFiction() {
		return true;
	}
}

