package file_ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileEx1 {

	public static void main(String[] args) {
		try {
			//BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\saraz\\Desktop\\data.txt"));		
			FileWriter w = new FileWriter("C:\\Users\\saraz\\Desktop\\data.txt");
			BufferedWriter bw = new BufferedWriter(w);
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			
			String data = "";
			while(! data.equals("stop")) {
				System.out.println("Enter data: ");
				data = br.readLine();
				System.out.println("data is: " + data);
				
				bw.write(data + "\n");
			}
			
			br.close();
			bw.close();
		}
		catch (IOException e) {
			 e.printStackTrace();
		}
		

	}
	
	
}
