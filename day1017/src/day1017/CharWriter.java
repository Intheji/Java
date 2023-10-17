package day1017;

import java.io.FileWriter;
import java.io.Writer;

public class CharWriter {
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("src/files/memo1.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}
}
