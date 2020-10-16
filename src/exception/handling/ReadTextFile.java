package exception.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException{
		String filePath = "/Users/matiur/eclipse-workspace-managed/Project60/textfile/cnn-news.txt";
		FileReader fr = null;
		BufferedReader br = null;
		//BufferedReader br1 = new BufferedReader(new FileReader(filePath));
		try {
			fr = new FileReader(filePath);
		} catch (FileNotFoundException e) {
			System.out.println("File is not locateable, please check the correct file name or location");
		}
		try {
			br = new BufferedReader(fr);
			
			String data = "";
			while((data = br.readLine()) != null) {
			   System.out.println(data);
			}
		}catch(Exception ex) {
			System.out.println("File is not readable, may be data is corrupted");
		}finally {
			if(br != null) {
				br.close();
			}
			if(fr != null) {
				fr.close();
			}
		}
		
	}

}
