package Convertions;

public class StringToStringArray {

	public static void main(String[] args) {

		String str = "Hello this is java program";
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}
