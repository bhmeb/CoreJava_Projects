package InputFromUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader fileReader;
		String str = null;
		File file=new File("C:\\Users\\Arpan\\Desktop\\abc.txt");
		
		fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		System.out.println("File contents below lins: ");
		try {
			str=bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(str!=null) {
			System.out.println(str);
			try {
				str=bufferedReader.readLine(); //will print value in next line. 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
