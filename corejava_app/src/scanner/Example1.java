package scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter interger value");
		int i = sc.nextInt();
		
		System.out.println("Enter another integer value");
		int j = sc.nextInt();
		
		int k = i+j;
		System.out.println(k);
	}
}
