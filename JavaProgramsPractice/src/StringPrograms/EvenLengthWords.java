package StringPrograms;

public class EvenLengthWords {

	public static void main(String[] args) {
		String str = "This a for hum java language";

		for(String word : str.split(" ")) {
			
			if(word.length() % 2 ==0){
				System.out.println(word);
			}
			
		}
	}

}
