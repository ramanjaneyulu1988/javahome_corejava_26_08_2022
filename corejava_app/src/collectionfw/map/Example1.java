/**
 * 
 */
package collectionfw.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MY PC
 *
 */
public class Example1 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
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
		
//		map.clear();
//		System.out.println(map);
		
		System.out.println(map.get("Ra"));
		
		boolean b = map.isEmpty();
		System.out.println(b);
		
		// keySet
		// entrySet
	}
}
