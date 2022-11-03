package collectionfw.set;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("abc");
		set.add("xyz");
		set.add("Ram");
		set.add("Alex");
		set.add("Pavan");
		set.add("abc");
		set.add("abc");
		set.add("Alex");
		set.add("Alex");
		set.add("Alex");
		
		System.out.println(set);
	}
}
