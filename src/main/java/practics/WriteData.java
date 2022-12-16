package practics;

import java.io.FileWriter;
import com.opencsv.CSVWriter;

public class WriteData {

	public static void main(String[] args) {
		
		try {
			CSVWriter cw = new CSVWriter(new FileWriter("D:\\one.json"));
			
			System.out.println("start");
						
			long million =1;
			for(int i =1 ; i<=10000000; i++) {

				//write dummy data
				String data[] = {String.valueOf(i),String.valueOf(i),String.valueOf(i),String.valueOf(i)}; 
				cw.writeNext(data);			 
				
				if(i%1000000==0) {
					System.out.println("# of Million lines written: "+ million++);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("done");
			
		}
		
	}
	
}
