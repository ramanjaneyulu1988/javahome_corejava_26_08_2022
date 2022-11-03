package exception;

public class Example8 {

	public static void main(String[] args) {
		
		System.out.println("main method start..");
		
		System.out.println("Opening connection..");
		
		try
		{
			int k = 10/0;
			System.out.println(k);
			
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Closing connection...");
		}
		
		String s = null;
		int i = s.length();
		System.out.println(i);
		
		
		System.out.println("main method end...");
	}
}
