package day1017;

import java.io.FileWriter;
import java.io.Writer;

public class CharWriter2 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("src/files/memo2.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}
}
