package hashmap;

import java.util.HashMap;

public class HashMapIntro {

	public static void main(String[] args) {
		
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Naresh", "1");
		map.put("Barath", "2");
		map.put("Denny", "1");
		map.put("Naresh", "3");
		
		int count =0;
		


		if(map.containsKey("Naresh")) {
			
			count++;
			System.out.println(map.get("Naresh"));
			
		}
		
		System.out.println(count);

		
	}
}
