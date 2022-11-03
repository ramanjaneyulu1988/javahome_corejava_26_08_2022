package string;

public class ImmutableExample {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		String s = "abc"; // create one Object
		System.out.println(s.hashCode());
		
		s.concat("xyz"); // create another object
		System.out.println(s.hashCode());
		
		System.out.println(s); // abcxyz
		
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("abc");
		System.out.println(sb.hashCode());
		sb.append("xyz");
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
		
		System.out.println("main method end...");
	}
}
