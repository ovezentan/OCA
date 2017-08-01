import java.util.*;
import java.util.ArrayList;
public class Convert {
	public static void main(String[] args) {
		String[] array = {"hawk", "robin"};
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		list.set(1, "test");
		array[0] = "new";
		for(String b : array) System.out.print(b + "");
		list.remove(1);
		System.out.println(list.size() + "size");
	}
}