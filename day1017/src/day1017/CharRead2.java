package day1017;

import java.io.FileReader;
import java.io.Reader;

public class CharRead2 {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("src/files/memo2.txt");
		
		char[] b = new char[100];
		
		while(true) {
			int data = reader.read(b);
			if (data == -1) break;
			
			for(int i=0; i<b.length; i++) {
				System.out.println(b[i]);
			}
		}
		reader.close();
	}
}
