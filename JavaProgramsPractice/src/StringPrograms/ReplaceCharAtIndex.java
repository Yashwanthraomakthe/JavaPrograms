package StringPrograms;

public class ReplaceCharAtIndex {

	public static void usingReplceMethod() {
		String str = "Hello";
		System.out.println(str.replace('e', 'l'));
	}

	public static void usingStringClass() {
		String str = "Yash";
		char c = 'l';
		int index =2;
		String strnew = str.substring(0,index)+c+ str.substring(index+1);
		System.out.println(strnew);

	}
	
	public static void usingStringBufferClass() {
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.insert(3, 'x'));
		sb.setCharAt(0, 'K');
		System.out.println(sb);
	}

	public static void main(String[] args) {
		usingReplceMethod();
		usingStringClass();
		usingStringBufferClass();

	}

}
