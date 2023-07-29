package StringPrograms;

public class NoOfCharacters_01_02 {

	public static void main(String[] args) {
		String name = "The best of both worlds";
		int stringLength = name.length();

		int count = 0;
		for (int i = 0; i < stringLength; i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println(count);

	}

}
