package accessspecifiers;

public class Example1 {

	public static void main(String[] args) {
		
		Example1.test1();
		Example1.test2();
		Example1.test3();
		Example1.test4();
	}
	
	public static void test1()
	{
		System.out.println("test1 method");
	}
	
	protected static void test2()
	{
		System.out.println("test2 method");
	}
	
	static void test3()
	{
		System.out.println("test3 method");
	}
	
	private static void test4()
	{
		System.out.println("test4 method");
	}
}
