package collectionfw.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {

		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("Ram", "Dayya");
		map.put("abc", "xyz");
		map.put("Alex", "Rao");
		map.put("Rak", "Rakesh");
		map.put("Raj", "Rajesh");
		map.put("Pavan", "Chitra");
		map.put("Pavan", "Dayya");
		map.put("Maruthi", "Chitra");
		map.put("Praveen", "Chitra");

		System.out.println(map);

	}
}
