package StringPrograms;

public class ReversString {

	public static void main(String[] args) {
		String str = "AlignTech To WelCome";
		int strLength = str.length();
		String revString = "";
		for (int i = strLength-1 ; i >= 0; i--) {
			revString = revString + str.charAt(i);

		}
		System.out.println("Original String is  " + str);
		System.out.println("Reversed String is  " + revString);

	}

}
