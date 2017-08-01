public class Substring {
	public static void main(String[] args) {
		String string = "animals";
		System.out.println(string.substring(3));
		System.out.println(string.substring(string.indexOf('m')));
		System.out.println(string.substring(3,4));
		System.out.println(string.substring(3,7));
		System.out.println(string.substring(3,3) + "hello"); // empty string
		System.out.println(string.substring(3,2)); //java.lang.StringIndexOutOfBoundsException
		System.out.println(string.substring(3,8)); // java.lang.StringIndexOutOfBoundsException
	}
} 