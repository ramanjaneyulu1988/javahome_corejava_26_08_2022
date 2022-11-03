package stringbuffer;

public class Example2 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.append("abc");
		sb.append(" ");
		sb.append("xyz");
		
		String s = sb.toString();
		System.out.println(s);
	}
}
