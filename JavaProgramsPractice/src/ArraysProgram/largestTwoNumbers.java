package ArraysProgram;

public class largestTwoNumbers {

	// incomplete
	public static void main(String[] args) {
		int[] no = { 2, 7, 23, 8, 1 };
		int largestOne = 0;
		int largestTwo = 0;
		for (int i = 0; i < no.length; i++) {
			if (no[i] > largestOne) {
				largestOne = no[i];
			}

		}

		for (int j = 0; j < no.length; j++) {
			if (no[j] < largestOne) {
				largestTwo = no[j];
			}

		}
		System.out.println("Largest number is " + largestOne);
		System.out.println("Secound largest number is " + largestTwo);

	}

}
