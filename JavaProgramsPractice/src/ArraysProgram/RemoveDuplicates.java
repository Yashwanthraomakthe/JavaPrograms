package ArraysProgram;

public class RemoveDuplicates {

	//Incomplete
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 2, 7, 8, 8, 9 };
		int arrayLength = number.length;
		for (int i = 0; i < arrayLength-1; i++) {
			if (number[i] != number[i + 1]) {
				System.out.println(number[i]);
			}
		}

	}
}