public class StringLength {
	public static void main(String[] args) {
		String string = "animals";
		System.out.println(string.length());
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(6));
		System.out.println(string.charAt(7)); // index doesn't exist
	}
}