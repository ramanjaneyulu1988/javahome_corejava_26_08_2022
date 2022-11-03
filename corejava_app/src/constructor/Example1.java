package constructor;

public class Example1 {
	
	public String fname; // abc
	public String lname; // xyz
	public String address;
	
	// Constructor
	public Example1(String fname, String lname, String address)
	{
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public static void main(String[] args) 
	{
		Example1 example1 = new Example1("abc", "xyz", "Hyderabad");
		
		System.out.println(example1.fname);
		System.out.println(example1.lname);
		System.out.println(example1.address);
	}
}
