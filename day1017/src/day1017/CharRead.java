package day1017;

import java.io.FileReader;
import java.io.Reader;

public class CharRead {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("src/files/memo1.txt");
		
		while(true) {
			int data = reader.read();
			if (data == -1) break;
			System.out.println((char) data);
		 }
		
		reader.close();
	}
}
