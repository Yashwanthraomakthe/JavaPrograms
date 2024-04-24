package ArraysProgram;

import java.util.Arrays;

public class minmaxnumbers {

	public static void UsingSortMethod() {
		int[] no = { 2, 4, 5, 90, 6, 1, 777 };
		Arrays.sort(no);
		System.out.println("Mininum number " + no[0]);
		System.out.println("Maxmimum number " + no[no.length - 1]);
	}

	public static void UsingForLoop() {
		int[] no = { 2, 4, 5, 90, 6 };
		int minNo = 0;
		int maxNo = 0;

		for (int i = 0; i < no.length; i++) {
			if (no[i] < minNo) {
				minNo = no[i];
			} else {
				maxNo = no[i];
			}

		}

		System.out.println("Mininum number " + minNo);
		System.out.println("Maxmimum number " + maxNo);
	}

	public static void main(String[] args) {
		//UsingSortMethod();
	}

}
