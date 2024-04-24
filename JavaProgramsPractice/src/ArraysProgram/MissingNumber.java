package ArraysProgram;

import java.util.Arrays;

//incomplete
public class MissingNumber {

	public static void main(String[] args) {
		int[] no = { 1, 2, 4, 6, 3, 7, 8 };
		Arrays.sort(no);

		int missingNo = 0;

		for (int i = 1; i < no.length; i++) {
			if (no[i] != i) {
				missingNo = i;
				break;
			}

		}

		System.out.println("Missing Number is " + missingNo);

	}

}
