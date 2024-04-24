package StringPrograms;

public class SwapPairOfChars {

	public static void main(String[] args) {
		String str = "Yash";
		int strLength = str.length();
		String newstr = "";

		for (int i = 0; i < strLength-1; i+=2) {

			char c1 = str.charAt(i);
			char c2 = str.charAt(i + 1);
			char temp;
			temp = c1;
			c1 = c2;
			c2 = temp;
			
			newstr= newstr+c1+c2;

		}

		System.out.println(newstr);

	}

}
