package exception;

public class Example7 {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
	}
}
