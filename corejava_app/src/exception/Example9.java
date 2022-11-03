package exception;

public class Example9 {

	public static void main(String[] args) {
		
		try
		{
			int k = 100/0;
			System.out.println(k);
		}
		finally
		{
			try
			{
				
			}
			catch (Exception e) {
				
			}
		}
		
		try
		{
			try
			{
				
			}
			catch (Exception e) {
				
			}
		}
		catch(Exception e)
		{
			try
			{
				
			}
			catch (Exception e1) {
				
			}
		}
	}
	
}
