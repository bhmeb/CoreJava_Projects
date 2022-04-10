package InputFromUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass2 {

	public static void main(String[] args) throws IOException {

		String str = null;
		FileReader fileReader;
		File file = new File("C:\\Users\\Arpan\\Desktop\\abc.txt");
		fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println("File contents below lins: ");

		str = bufferedReader.readLine();

		while (str != null) {
			System.out.println(str);

			str = bufferedReader.readLine(); // will print value in next line.
		}
		bufferedReader.close();
	}

}
