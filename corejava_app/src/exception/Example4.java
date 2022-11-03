package exception;

public class Example4 {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		String s = "Bangalore";
		
		try
		{
			char c = s.charAt(20);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
	}
}
