package StringPrograms;

public class palindrome_13 {

	//A string is said to be palindrome if it is the same from both the ends.
	public static void main(String[] args) {
		String name1 = "kayak";
		String reverseName1="";
		String name2="kayak";
		
		for(int i=name1.length()-1;i>=0;i--) {
			reverseName1 =reverseName1+name1.charAt(i);
		}
		
		System.out.println("Orginal String is " + name1);
		System.out.println("Reverse String is " + reverseName1);
		
		if(reverseName1.equals(name2)) {
			System.out.println("Given Strings are palindrome");
		}else {
			System.out.println("Given Strings are not palindrome");
		}

	}

}
