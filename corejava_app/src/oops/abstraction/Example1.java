package oops.abstraction;

abstract class Test
{
	public abstract void test();
	
	public void test1()
	{
		
	}
}
 
public class Example1 extends Test
{
	public static void main(String[] args) {
		
		Test t = new Example1();
		
		t.test();
	}
	
	public void test()
	{
		System.out.println("test method");
	}
}
