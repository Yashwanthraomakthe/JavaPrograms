package NumberPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter a Year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("Given Year is leap year");
		} else {
			System.out.println("Given year is not leap year");
		}
	}

}
