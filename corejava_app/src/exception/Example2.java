package exception;

public class Example2 {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		String s = null;
		
		try
		{
			System.out.println(s.concat("xyz"));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
	}
}
