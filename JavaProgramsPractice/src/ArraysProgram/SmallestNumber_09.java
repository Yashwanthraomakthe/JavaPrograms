package ArraysProgram;

public class SmallestNumber_09 {

	public static void main(String[] args) {
		int[] number = { 3, 9, 5, 15, 2 };
		int arrayLength = number.length;
		int samllestNumber = number[0];
		for (int i = 0; i < arrayLength; i++) {
			if (number[i] < samllestNumber) {
				samllestNumber = number[i];
			}
		}
		System.out.println("samllest Number is array is " + samllestNumber);
	}
}
