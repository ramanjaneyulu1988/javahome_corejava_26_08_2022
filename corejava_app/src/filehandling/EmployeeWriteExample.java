package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeWriteExample {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setId(100);
		e.setFname("abc");
		e.setLname("xyz");
		e.setSalary(50000.0);
		
		File file = new File("D:/files");
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		try
		{
			fOut = new FileOutputStream(file+"/employee.txt");
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(e);
			oOut.flush();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fOut.close();
				oOut.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("Done");
	}
}
