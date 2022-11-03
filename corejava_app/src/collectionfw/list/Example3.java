package collectionfw.list;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();

		nameList.add("Alex");
		nameList.add("Ram");
		nameList.add("Hyd");
		nameList.add("Blr");
		nameList.add("Raj");
		nameList.add("Maruthi");
		nameList.add("Rakesh");
		
		nameList.add(3, "Munna");
		
		System.out.println(nameList);
	}
}
