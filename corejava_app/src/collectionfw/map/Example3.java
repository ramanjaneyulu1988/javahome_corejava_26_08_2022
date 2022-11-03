package collectionfw.map;

import java.util.Map;
import java.util.TreeMap;

public class Example3 {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<String, String>();

		map.put("Ram", "Dayya");
		map.put("Abc", "xyz");
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
