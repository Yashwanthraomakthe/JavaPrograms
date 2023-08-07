package GeneralConcepts;

import java.util.HashMap;

public class maps {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Ashok");
		map.put(1, "Yash");
		System.out.println(map); //{1=Yash}
		System.out.println(map.keySet());//[1]
		System.out.println(map.values());//[Yash]
		
		
	}

}
