package collectionfw;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List list = new ArrayList(3); // auto upcasting
		
		list.add(0, "Ram");
		list.add("abc");
		list.add("xyz");
		list.add(false);
		list.add('b');
		list.add(100.90);
		list.add(40);
		list.add(200);
		
		
		System.out.println(list);
		
//		list.clear();
//		System.out.println(list);
		
		boolean b = list.contains("ab");
		System.out.println(b);
		
		System.out.println(list.get(5));
		
		boolean b1 = list.isEmpty();
		System.out.println(b1);
		
		List list1 = list.subList(0, 4);
		System.out.println(list1);
		
		List list2 = list.subList(4, list.size());
		System.out.println(list2);
		
		System.out.println(list.size());
		
	}
}
