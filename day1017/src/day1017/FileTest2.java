package day1017;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/files/fileTest.txt");
		
		if (!file.exists()) {
			System.out.println("파일을 생성합니다.");
			file.createNewFile();
		}
		
		if (file.canWrite()) {
			System.out.println("쓰기가 가능한 파일입니다.");
		}
		
		if (file.isHidden()) {
			System.out.println("숨김속성");
		}
		
		file.delete();
	}
}
