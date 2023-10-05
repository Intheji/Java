package day1005;

import java.util.Scanner;

public class ObjectString5 {

	public static void main(String[] args) {
		String al = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		
		// 사용자에게서 한 글자를 입력받아서
		// 입력한 글자가 문자인지 숫자인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 또는 숫자 한 글자를 입력하세요 : ");
		
		String str = sc.nextLine();
		
		int alphabetIdx = al.indexOf(str);
		int numberIdx = num.indexOf(str);
		
		System.out.println("입력한 문자 : " + str);
		
		
		if (alphabetIdx != -1) {
			System.out.printf("입력하신 " + str + "은 문자입니다.");
		} else if (numberIdx != -1){
			System.out.printf("입력하신 " + str + "은 숫자입니다.");
		} else {
			System.out.println("입력된 값을 다시 확인하세요.");
		}
		
	}
}
