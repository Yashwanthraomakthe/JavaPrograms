package StringPrograms;

public class ReverseStringWordByWord_26 {

	public static void main(String[] args) {
		String str = "Dream big or die";
		int strLength = str.length();

		String[] strArray = str.split(" ");
		for (int i = strArray.length - 1; i >= 0; i--) {
			// System.out.println(strArray[i]);
			String newstr = strArray[i];
			String[] newRevArray = new String[newstr.length()];

			for (int j = newstr.length() - 1; j >= 0; j--) {
				String revnewstr = "";
				revnewstr = revnewstr + newstr.charAt(j);
				for (int x = 0; x < newRevArray.length; x++) {
					System.out.print(newRevArray[x]);
				}
			}
			// System.out.println(newRevArray.toString());

		}

	}

}
