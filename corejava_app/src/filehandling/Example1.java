package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Main method start...");
		
		File file = new File("D:/files");
		FileWriter fileWriter = null;
		String content = "Bangalore is a city\nHyderabad is a city\nChennai is a city";
		try
		{
			fileWriter = new FileWriter(file+"/ram.txt", true);
			fileWriter.write(content);
			fileWriter.flush(); // Giving permission to write the data
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main method end...");
		
	}
}
