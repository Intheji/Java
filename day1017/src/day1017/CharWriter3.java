package day1017;

import java.io.FileWriter;
import java.io.Writer;

public class CharWriter3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("src/files/memo3.txt");
		
		String str = "ABC";
		
		writer.write(str, 1, 2);
		
		writer.flush();
		writer.close();
	}
}
