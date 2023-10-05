package day1005;

import java.io.UnsupportedEncodingException;

public class ObjectString1 {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		String str3 = "자바 프로그래밍";
		
		int location = str3.indexOf("프로그래밍");
		System.out.println(location);
		
		String str4 = "자바 프로그래밍. 자바는 재밌어요.";
		String str5 = str4.replace("자바", "JAVA");
		
		System.out.println(str5);
		
		String str6 = "911223-1122334";
		
		String firstNum = str6.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = str6.substring(7);
		System.out.println(secondNum);
		
		
		// getBytes 바이트 배열로 저장
		String str7 = "안녕하세요";
		
		try {
			byte[] bytes1 = str7.getBytes("UTF-8");
			System.out.println("bytes1.length : " + bytes1.length);
			
			String str8 = new String(bytes1);
			System.out.println(str8);	
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
