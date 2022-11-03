package collectionfw.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();

		set.add("abc");
		set.add("xyz");
		set.add("ram");
		set.add("alex");
		set.add("pavan");
		set.add("abc");
		set.add("abc");
		set.add("alex");
		set.add("alex");
		set.add("alex");
		set.add("maruthi");
		set.add("praveen");

		System.out.println(set);
		
		System.out.println("Using enhanced forloop...");
		for(String s : set)
		{
			System.out.println(s);
		}
		
		System.out.println("Using iterator...");
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
