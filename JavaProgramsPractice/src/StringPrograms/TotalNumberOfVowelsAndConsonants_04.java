package StringPrograms;

public class TotalNumberOfVowelsAndConsonants_04 {

	public static void main(String[] args) {
		String str1 = "This is a really simple sentence";
		String str=str1.toLowerCase();
		int strLength = str.length();
		int noOfVowels = 0;
		int noOfConsonents = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				noOfVowels++;
			} else if(str.charAt(i)>'a' && str.charAt(i)<'z')
				noOfConsonents++;
		}
		System.out.println("Given String Length " +strLength);
		System.out.println("No of Vowels in given string " + noOfVowels);
		System.out.println("No of Consonents in given string " + noOfConsonents);

	}

}
