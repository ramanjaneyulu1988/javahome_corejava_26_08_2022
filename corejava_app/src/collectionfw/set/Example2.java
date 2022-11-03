package collectionfw.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<String>();

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
		set.add("Maruthi");

		System.out.println(set);
	}
}
