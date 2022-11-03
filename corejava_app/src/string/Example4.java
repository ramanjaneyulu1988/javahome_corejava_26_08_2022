package string;

public class Example4 {

	public static void main(String[] args) {
		
		String s = "Alex";
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println(sb1);
	}
}
