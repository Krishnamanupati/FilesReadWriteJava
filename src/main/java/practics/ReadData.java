package practics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		String pathString = "D:\\one.json";
		
		FileReader fileReader = new FileReader(new File(pathString));
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		try {
					
			String line = bufferedReader.readLine();
			
			while (line != null) {
				
				
				//D:\WorkSpace\Test\mavenProjec
				
				  String []columns = ((String) line).split(",");
				  
				  for (String column : columns) {
				  
				  System.out.print(column+" ");
				  
				  line = bufferedReader.readLine(); 
			}
				 		 
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			fileReader.close();
			bufferedReader.close();
			System.out.println("done");
		}
	}
}
