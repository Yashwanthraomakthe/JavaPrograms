package NumberPrograms;

public class ReversNumber_01 {

	public static void main(String[] args) {
		int number = 2398;
		int reverse = 0;
		System.out.println("Original Number " + number);

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		System.out.println("Reversed Number " + reverse);

	}

}
