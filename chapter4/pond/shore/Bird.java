package pond.shore;
public class Bird {
	protected String text = "floating";
	protected void floatInWater() {
		System.out.println(text);
	}
	public static void main(String[] args) {
		Bird obj = new Bird();
		obj.floatInWater();
		
	}
}