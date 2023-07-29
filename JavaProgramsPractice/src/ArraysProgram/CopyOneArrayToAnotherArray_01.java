package ArraysProgram;

public class CopyOneArrayToAnotherArray_01 {

	public static void main(String[] args) {
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

}
