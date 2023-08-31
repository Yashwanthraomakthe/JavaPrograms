package StringPrograms;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		programOne();
		programTwo();
	}
	
	
	public static void programOne() {
		
		String number = "t4h57i90s1";
		int strLength = number.length();
		int sum = 0;
		for (int i = 0; i < strLength; i++) {
			char c = number.charAt(i);
			if (Character.isDigit(c)) {
				sum = sum + Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println("SumOfNumbersInString from programOne " + sum);
		
	}
	
public static void programTwo() {
		
		String number = "this is test123 788 xyz987";
		int strLength = number.length();
		int sum = 0;
		for (int i = 0; i < strLength; i++) {
			char c = number.charAt(i);
			if (Character.isDigit(c)) {
				sum = sum + Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println("SumOfNumbersInString from programTwo " + sum);
		
	}
}