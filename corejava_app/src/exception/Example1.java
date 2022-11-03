package exception;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		try
		{
			int i = 100/0;
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
		System.out.println("main method end...");
		System.out.println("main method end...");
		System.out.println("main method end...");
		System.out.println("main method end...");
		System.out.println("main method end...");
	}
}
