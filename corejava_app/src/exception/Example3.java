package exception;

public class Example3 {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		
		int arr[] = {10, 40, 20, 15, 50};
		
		try
		{
			System.out.println(arr[30]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
		
		
	}
}
