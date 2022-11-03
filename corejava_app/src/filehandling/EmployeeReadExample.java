package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeReadExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		File file = new File("D:/files");
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		try
		{
			fIn = new FileInputStream(file+"/employee.txt");
			oIn = new ObjectInputStream(fIn);
			Object obj = oIn.readObject();
			Employee emp = (Employee)obj;
			
			System.out.println(emp.getId());
			System.out.println(emp.getFname());
			System.out.println(emp.getLname());
			System.out.println(emp.getSalary());
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fIn.close();
				oIn.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
