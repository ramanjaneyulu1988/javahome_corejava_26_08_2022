package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example3 {

public static void main(String[] args) {
		
		File file = new File("D:/files");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try 
		{
			fileReader = new FileReader(file+"/business-csv.csv");
			bufferedReader = new BufferedReader(fileReader);
			
			String content = "";
			while((content = bufferedReader.readLine()) != null)
			{
//				System.out.println(content);
				
				String str[] = content.split(",");
				System.out.println(str[7] +" # "+ str[9]+" # "+str[10]);
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
