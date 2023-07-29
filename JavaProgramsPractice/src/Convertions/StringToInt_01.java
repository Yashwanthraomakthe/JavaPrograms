package Convertions;

public class StringToInt_01 {

	public static void main(String[] args) {

		String name = "100";
		int intName = Integer.parseInt(name);
		Integer i = Integer.valueOf(name);
		System.out.println("Integer form of name " + intName);
		System.out.println("Integer form of name " + i);

	}

}
