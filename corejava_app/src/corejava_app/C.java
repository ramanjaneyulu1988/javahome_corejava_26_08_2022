package corejava_app;

public class C {

	public static void main(String[] args) {
		
		System.out.println("main method");
		
		C.test();
		
		C c = new C();
		c.test1();
	}
	
	public static void test()
	{
		System.out.println("test method");
	}
	
	public void test1()
	{
		System.out.println("test1 method");
	}
}
