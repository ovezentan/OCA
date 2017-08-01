package main.java.inheritance;

public class Customer extends Book {
	public Customer() {
		super();
		System.out.println("A customer has been created!");
	}
	
	@Override
	public void isBestSeller() {
		System.out.println("A customer buys bestsellers books");
	}
		
	@Override
	public void isOnDiscount() {
		System.out.println("A customer buys books on discount");
		
	}
}
