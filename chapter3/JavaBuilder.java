public class JavaBuilder {
	public static void main(String[] args) {
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		if(s1 == s2)
			System.out.print("1");
		if(s1.equals(s2))
			System.out.print("2");
	}
	
}