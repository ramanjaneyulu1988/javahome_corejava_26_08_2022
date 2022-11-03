package exception;

public class Example6 {

	public static void main(String[] args) {
		
		System.out.println("main method start..");
		
		String s = "100abc";
		try
		{
			double i = Double.parseDouble(s);
			System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end..");
	}
}
