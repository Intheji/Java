package day1017;

import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderWriter {
	public static void main(String[] args) throws Exception {
		
		// 현재 내 운영체제의 문자 타입을 확인
		InputStreamReader encoding = new InputStreamReader(System.in);;
		System.out.println("encoding : " + encoding.getEncoding());
		
		int ch;
		
		// System.in : 바이트 단위로 읽어오므로 한글이 깨짐
		while((ch = System.in.read()) != '\n') {
			System.out.println((char) ch);
		}
		
		System.out.println();
		
		System.out.println("한글 입력하고 엔터 > ");
		
		// 보조기능스트림을 이용하여 바이트 스트림을 문자로 변환하여 출력
		InputStreamReader in = new InputStreamReader(System.in);
		
	}
}
