public class ReferenceVar {
	public static void main(String[] args) {
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder();
		//objects[0] = new StringBuilder();
		StringBuilder[0] = new StringBuilder();
		System.out.println(strings);
		System.out.println(objects);
		System.out.println(againStrings);
		System.out.println(StringBuilder[0]);
	}
}