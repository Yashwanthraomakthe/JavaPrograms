package StringPrograms;

public class ReversString_16_27 {

	public static void main(String[] args) {
		String str = "Dream big";
		int strLength = str.length();
		String revString = "";
		for (int i = strLength - 1; i > 0; i--) {
			revString = revString + str.charAt(i);

		}
		System.out.println("Original String is  " + str);
		System.out.println("Reversed String is  " + revString);

	}

}
