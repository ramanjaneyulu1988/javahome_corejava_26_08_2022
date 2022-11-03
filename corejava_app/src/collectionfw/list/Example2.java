package collectionfw.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Alex");
		nameList.add("Ram");
		nameList.add("Hyd");
		nameList.add("Blr");
		nameList.add("Raj");
		nameList.add("Maruthi");
		
		System.out.println(nameList);
		
		System.out.println("Using for loop...");
		for(int i=0; i<nameList.size(); i++)
		{
			System.out.println(nameList.get(i));
		}
		
		System.out.println("Using enhanced for loop...");
		for(String s : nameList)
		{
			System.out.println(s);
		}
		
		System.out.println("Using iterator...");
		Iterator<String> it = nameList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using listIterator...");
		ListIterator<String> lit = nameList.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
	}
	
}
