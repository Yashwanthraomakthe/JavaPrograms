package ArraysProgram;

import java.util.Arrays;

public class arrayCompare {

	public static void main(String[] args) {
		int[] n01 = { 3, 9, 5, 15, 2};
		int[] n02 = { 3, 9, 5, 15, 2 };

		if (Arrays.equals(n01, n02)) {
			System.out.println("Both arrays are same");
		} else {
			System.out.println("Both arrays are not same");
		}
		
		
		//Arrays.sort(n01);
		//Arrays.sort(n02);

	}

}
