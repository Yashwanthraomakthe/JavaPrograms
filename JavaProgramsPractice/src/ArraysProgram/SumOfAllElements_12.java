package ArraysProgram;

public class SumOfAllElements_12 {

	public static void main(String[] args) {
		int[] number = { 3, 9, 5, 15, 2 };
		int arrayLength = number.length;
		int sum = 0;
		for (int i = 0; i < arrayLength; i++) {
			sum = sum + number[i];
		}
		System.out.println(sum);
	}

}
