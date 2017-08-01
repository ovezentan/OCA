package pond.duck;
public class FatherDuck {
	private String noise = "quack";
	private void quack() {
		System.out.println(noise);
	}
	private void makeNoise() {
		quack();
	}
	public static void main(String[] args) {	
		FatherDuck fatherDuck = new FatherDuck();
		System.out.println(fatherDuck.noise);
	}
}