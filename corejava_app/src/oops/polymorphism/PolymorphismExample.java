package oops.polymorphism;

class Test
{
	public void test(String name)
	{
		System.out.println("Test - test method");
	}
}

class Test1 extends Test
{
	// Method overiding
	public void test(String name)
	{
		System.out.println("Test1 - test method");
	}
}

public class PolymorphismExample extends Test
{
	public static void main(String[] args) {
		
		System.out.println("main method");
		Test polymorphismExample = new PolymorphismExample(); // Auto upcasting
		
		polymorphismExample.test("abc");
		
		Test t = new Test1();
		t.test("xyz");
		
	}
	
	// Method overiding
	public void test(String name)
	{
		System.out.println("PolymorphismExample - test method");
	}
}
