package day1017;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
	try {
		in = new FileInputStream("src/files/input.txt");
		
		out = new FileOutputStream("src/files/output.txt");
		
		int buf;
		
		while( (buf = in.read()) != -1) {
			System.out.println((char) buf);
			out.write(buf);
		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		if (in != null) 
			in.close();
		if (out != null)
			out.close();
	}
}
