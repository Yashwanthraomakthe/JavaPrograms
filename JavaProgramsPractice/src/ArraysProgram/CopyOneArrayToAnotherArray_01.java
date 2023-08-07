package ArraysProgram;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray_01 {

	public static void main(String[] args) {
		
		arrayCopyUsingForLoop();
		arrayCopyUsingClone();
		arrayCopyUsingArrayCopy();
		
	}
	
	public static void arrayCopyUsingForLoop() {
		System.out.println("----------------------------------------------");
		String[] names = { "Dinky", "Pooja", "Rahul", "Yash" };
		String[] newarray = new String[names.length];
		System.out.println("Displyaing the array elements of first array");
		for(int i=0;i<names.length;i++) {
			newarray[i]=names[i];
			System.out.println(names[i]);
		}
		
		System.out.println("Displyaing the array elements of new array");
		for(int i=0;i<newarray.length;i++) {
			System.out.println(newarray[i]);		
		}
	}
	
	public static void arrayCopyUsingClone() {
		System.out.println("----------------------------------------------");
		String[] names = { "Dinky", "Pooja", "Rahul", "Yash" };
		String[] newNames=names.clone();
		for(int i =0;i<newNames.length;i++) {
			System.out.println(newNames[i]);
		}
		
	}
	
	public static void arrayCopyUsingArrayCopy() {
		System.out.println("----------------------------------------------");
		String[] names = { "Dinky", "Pooja", "Rahul", "Yash" };
		String[] newNames=new String[names.length];
		
		System.arraycopy(names, 0, newNames, 0, names.length);
		
		for(int i =0;i<newNames.length;i++) {
			System.out.println(newNames[i]);
		}
		
	}

}
