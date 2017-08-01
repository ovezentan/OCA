public class NumbersArray {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		System.out.println(numbers);
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i);
		    numbers[i] = i+5;
			System.out.println(numbers[i] = i+5);
		}
	}
}