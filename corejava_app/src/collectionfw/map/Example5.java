package collectionfw.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example5 {

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
		
		
		Set<Entry<String, String>> entries = map.entrySet();
		
		System.out.println("Using entrySet with enhanced forloop...");
		for(Entry<String, String> entry : entries)
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		System.out.println("Using entrySet with iterator...");
		Iterator<Entry<String, String>> it = entries.iterator();
		while(it.hasNext())
		{
			Entry<String, String> entry = it.next();
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println("Using keySet with enhanced forloop...");
		for(String key : keys)
		{
			System.out.println(key+" = "+map.get(key));
		}
		
		System.out.println("Using keySet with iterator...");
		Iterator<String> it1 = keys.iterator();
		while(it1.hasNext())
		{
			String key = it1.next();
			System.out.println(key+" = "+map.get(key));
		}
	}
}
