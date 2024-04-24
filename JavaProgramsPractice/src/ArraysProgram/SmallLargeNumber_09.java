package ArraysProgram;

public class SmallLargeNumber_09 {

	public static void main(String[] args) {
		int[] number = { 3, 9, 16, 1, 22 };
		int arrayLength = number.length;
		int samllestNumber = number[0];
		int largestNumber = number[0];
		for (int i = 0; i < arrayLength; i++) {
			if (number[i] < samllestNumber) {
				samllestNumber = number[i];
			}else
				largestNumber = number[i];
		}
		System.out.println("samllest Number is array is " + samllestNumber);
		System.out.println("Largest Number is array is " + largestNumber);
	}
}
