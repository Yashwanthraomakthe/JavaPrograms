package StringPrograms;

public class RemoveLeadingZeros {


	public static methodOne(){

		//this is the dummy code added to delete

	}

	public static void main(String[] args) {
		String str = "0000002347";
		String newstr = "";
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != '0') {
				index = i;
				break;

			}

		}

		newstr = str.substring(index, str.length());

		System.out.println(newstr);

	}
}