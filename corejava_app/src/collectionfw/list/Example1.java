package collectionfw.list;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("abc");
		list.add("xyz");
		list.add("Ram");
		list.add("Blr");
		list.add("Hyd");
		list.add("Ram");
		list.add("Blr");
		list.add("Blr");
		
		System.out.println(list);
		
		int index = list.indexOf("xyz");
		System.out.println(index);
		
		list.remove("Hyd");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.set(0, "Alex");
		System.out.println(list);
	}
}
