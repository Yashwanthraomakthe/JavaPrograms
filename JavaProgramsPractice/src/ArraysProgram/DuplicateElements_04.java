package ArraysProgram;

public class DuplicateElements_04 {

	public static void main(String[] args) {

		int[] names = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		int arrayLength = names.length;

		for (int i = 0; i < arrayLength; i++) {

			for (int j = i + 1; j < arrayLength; j++) {
				if (names[j] == names[i]) {
					System.out.println(names[j]);
				}
			}
		}

	}

}
