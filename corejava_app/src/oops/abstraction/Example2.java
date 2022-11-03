package oops.abstraction;

interface A
{
	public abstract void test();
}

interface B
{
	public abstract void test1();
	
	public abstract void test2();
	
	public abstract void test3();
}

public class Example2 implements A, B
{

	public static void main(String[] args) {
		
		A a = new Example2();
		a.test();
		
		B b = new Example2();
		b.test1();
	}
	
	
	public void test()
	{
		System.out.println("test method");
	}
	
	public void test1()
	{
		System.out.println("test1 method");
	}
	
	public void test2()
	{
		System.out.println("test2 method");
	}
	
	public void test3()
	{
		System.out.println("test3 method");
	}
}
