package day1017;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CharEncodingTest {
	public static void main(String[] args) throws Exception {
		File fileEnco = new File("src/files/input2.txt");
		
		FileInputStream fis = new FileInputStream(fileEnco);
		
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		String str;
		
		while( (str = br.readLine()) != null) {
			System.out.println(str); 
		}
	}
}
