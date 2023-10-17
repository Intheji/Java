package day1017;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Bank {
	private final String USER_NAME;
	private final String NUMBER;
	private int amount;
	
	public Bank(String userName, String number, int amount) {
		this.USER_NAME = userName;
		this.NUMBER = number;
		this.amount = amount;
		
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %d", USER_NAME, NUMBER, amount);
	}
	
	
}

public class BankAccount {
	public static void main(String[] args) throws IOException, InterruptedException {
		// 파일 읽어오기
		
		//1. 파일 객체 생성하기
		File file = new File("accounts.txt");
		
		//2. 파일을 읽어오기 위해 FileReader 객체 생성
		FileReader fr = new FileReader(file);
		int ch;
		
		// 파일을 한 문장씩 읽음
		while( (ch=fr.read()) != -1 ) {
			System.out.print((char) ch);
			Thread.sleep(200);
		}
		
		// 4. file 객체와 연결 종료하기
		fr.close();
		
		
		
		
		// 파일 생성
//		Bank a = new Bank("김그린", "111-2222-33", 1000000);
//		Bank b = new Bank("이자바", "222-3333-44", 1000000);
//		
//		System.out.println(a.toString());
//		System.out.println(b.toString());
//		
//		//1. 파일 객체 생성
//		File file = new File("accounts.txt");
//		
//		//2. 파일 객체에 내용을 입력하기 위해 FileWriter 객체 생성
//		FileWriter fw = new FileWriter(file);
//		
//		//3. 파일에 내용 작성
//		fw.write(a.toString() + "\n");
//		fw.write(b.toString() + "\n");
//		
//		//4. file객체와 연결 종료하기
//		fw.close();
		
	}
}
