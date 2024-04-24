package ArraysProgram;

public class largestTwoNumbers {

	
	public static void main(String[] args) {
		
		int numbers[] = { 47, 3, 37, 49, 46, 5, 64, 21 };
	      //System.out.println(numbers.length);
	      int highest = 0;
	      int second_highest = 0;
	      for (int n : numbers) {
	         if (highest < n) {
	            second_highest = highest;
	            highest = n;
	         } else if (second_highest < n) {
	            second_highest = n;
	         }
	      }
	      System.out.println("First Max Number: " + highest);
	      System.out.println("Second Max Number: " + second_highest);

	}
}