package ArraysProgram;

public class SortDecendingOrder_15 {

	public static void main(String[] args) {
		int[] number = { 2, 9, 5, 6, 3 };
		int arrayLength = number.length;

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Before Sort" + number[i]);
		}

		int temp = 0;

		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (number[i] < number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}

		for (int i = 0; i < arrayLength; i++) {
			System.out.println("After sort" + number[i]);
		}

	}

}
