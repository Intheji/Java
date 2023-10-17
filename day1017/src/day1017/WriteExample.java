package day1017;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("src/files/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		
		// 버퍼 내부에 남아있는 바이트를 모두 출력하는 역할
		os.flush();
		os.close();
		
	}
}
