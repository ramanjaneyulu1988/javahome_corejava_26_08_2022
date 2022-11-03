package scanner;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First name");
		String fname = sc.nextLine();

		System.out.println("Enter Last name");
		String lname = sc.nextLine();

		String name = fname + lname;
		System.out.println(name);
	}
}
