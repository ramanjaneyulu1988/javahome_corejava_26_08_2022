package scanner;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter decimal value");
		double d1 = sc.nextDouble();
		
		System.out.println("Enter another decimal value");
		double d2 = sc.nextDouble();
		
		double d = d1+d2;
		System.out.println(d);
		
	}
}
