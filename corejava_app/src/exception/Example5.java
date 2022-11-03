package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		System.out.println("main method start...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer value");
		try
		{
			int i = sc.nextInt();
			System.out.println("Entered value is: "+i);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("main method end...");
		
	}
}
