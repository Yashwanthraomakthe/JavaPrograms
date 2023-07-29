package ArraysProgram;

public class PrintElementInEvenPosition_07 {

	public static void main(String[] args) {

		int[] number = { 2, 3, 5, 6, 7 };
		int arrayLength = number.length;
		for (int i = 1; i < arrayLength; i = i + 2) {
			System.out.println(number[i]);

		}

	}

}
