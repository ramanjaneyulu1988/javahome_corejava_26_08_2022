package string;

public class Example2 {

	public static void main(String[] args) {
		
		String s = "Bangalore";
		
		boolean b = s.contains("ra");
		System.out.println(b);
		
		char c = s.charAt(6);
		System.out.println(c);
		
		String s1 = s.concat(" ").concat("Hyderabad");
		System.out.println(s1); // BangaloreHyderabad
		
		boolean b1 = s.equals("bangalore"); // equals method it will check with cases
		System.out.println(b1);
		
		boolean b2 = s.equalsIgnoreCase("bangalore"); // equalsIgnoreCase method it won't check with cases
		System.out.println(b2);
		
		int index = s.indexOf('a');
		System.out.println(index);
		
		int index1 = s.lastIndexOf('a');
		System.out.println(index1);
		
		String s2 = s.replace("B", "b");
		System.out.println(s2);
		
		boolean b3 = s.isBlank();
		System.out.println(b3);
		
		boolean b4 = s.isEmpty();
		System.out.println(b4);
	}
}
