package oops.encapsulation;

public class EncapsulationExample1 {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setAddress("Bangalore");
		System.out.println(emp.getAddress());
		
		emp.setFname("abc");
		System.out.println(emp.getFname());
		
		emp.setId(100);
		System.out.println(emp.getId());
	}
}
