package day1017;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class ImageCopyExample {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원본 파일 이름을 입력하세요 > ");
		String inputFileName = scan.next();
		
		System.out.println("복사 파일 이름을 입력하세요 > ");
		String outputFileName = scan.next();
		
		try(
			InputStream is = new FileInputStream("src/files/" + inputFileName);
			OutputStream os = new FileOutputStream("src/files/" + outputFileName);
		) {
			int r;
			while( (r=is.read()) != -1) {
				os.write(r);
			}
			
			System.out.println(inputFileName + "을 " + outputFileName + "로 복사하였습니다.");
		}
	}
}
