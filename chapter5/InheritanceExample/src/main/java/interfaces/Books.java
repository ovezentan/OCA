package interfaces;
import main.*;

public class Books extends Book implements DiscountBook, BestSellerBook {

	private String name = null;
	
	public Books(String name) {
		this.name = name;
	}
	
	@Override
	public void isBestSeller() {
		System.out.println("bestsellerbooks");
	}
		
	@Override
	public void isOnDiscount() {
		System.out.println("discountbooks");
		
	}

	@Override
	public void printDiscountBookName() {
		System.out.println("DiscountBook: \"" + name + " OCA.\"");
	}

	@Override
	public void printBestSellerBookName() {
		System.out.println("BestSellerBook: \"" + name + " Design Patterns.\"");
	}
	
	public static void main(String[] args) {
		Books b = new Books("Books A");
		b.isBestSeller();
		b.isOnDiscount();
		b.printBestSellerBookName();
		b.printDiscountBookName();
		
	}
}
