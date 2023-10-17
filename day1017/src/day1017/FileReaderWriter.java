package day1017;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {
	public static void main(String[] args) throws Exception {
		
		// 바이트단위로 읽기
		FileInputStream fin = new FileInputStream("src/files/input2.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		FileOutputStream fout = new FileOutputStream("src/files/output2.txt");
		int buf;
				
		System.out.println("바이트 단위로 읽었을 때");
		while((buf = fin.read()) != -1) {
			System.out.println( (char) buf);
		}
		
		fin.close();
		
		FileReader fr = new FileReader("src/files/input2.txt");
		FileReader fw = new FileReader("src/files/output2.txt");

		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("\n\n 문자단위(2바이트)로 읽었을 때");
		
		while((buf = fin.read()) != -1) {
			System.out.print( (char) buf);
			fw.write(buf);
		}
		
		fin.close();
		
	}
}
