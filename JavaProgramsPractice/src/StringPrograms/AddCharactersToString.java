package StringPrograms;

public class AddCharactersToString {

	public static void generalApend() {
		String str = "Brag";
		char ch = 'a';
		String newstr = str + ch;
		System.out.println(newstr);

	}
	
	public static void StringBufferInsertMethod() {
		
		StringBuffer sb = new StringBuffer("Yashwanth");
		char ch = 'a';
		
		//insert char at last to given string
		StringBuffer newstr1 =sb.append(ch);
		System.out.println(newstr1);
		
		//insert char at specific index
		System.out.println(sb.insert(3, ch));
		
		

	}


	public static void main(String[] args) {
		generalApend();
		StringBufferInsertMethod();

	}

}
