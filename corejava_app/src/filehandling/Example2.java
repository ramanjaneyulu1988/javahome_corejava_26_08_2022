package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) {
		
		File file = new File("D:/files");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try 
		{
			fileReader = new FileReader(file+"/ram.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			String content = "";
			while((content = bufferedReader.readLine()) != null)
			{
				System.out.println(content);
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				bufferedReader.close();
				fileReader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
