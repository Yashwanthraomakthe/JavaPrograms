package NumberPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int no;
		System.out.println("Input any number");
		Scanner scr = new Scanner(System.in);
		no = scr.nextInt();
		if(no%2==0) {
			System.out.println("Given number of even");
		}else {
			System.out.println("Given number is odd");
		}
		
	}

}
