public class Test extends Person implements IsOnOffer {
	static int getPrice(){
		return 80;
	}
	public static void main(String[] args) {
		Student student = new Student("Robbert", "Den Haag","Informatics", 2, 900.00);
		System.out.println(" Name is " + student.getName()
            + " Address is " + student.getAddress()
		    + " Program is " + student.getProgram()
            + " Year is " + student.getYear()
			+ " Fee is " + student.getFee());
		IsOnOffer isOnOffer = student;
		System.out.println(IsOnOffer.getPrice());	
			
		Staff staff = new Staff("John", "Den Haag", "Informatics", 1500.00);
        System.out.println(" Name is " + staff.getName()
            + " Address is " + staff.getAddress()
		    + " School is " + staff.getSchool()
            + " Pay is " + staff.getPay());
			
	}
}