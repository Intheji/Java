package day1005;

import java.util.Scanner;

public class ObjectString4 {
	public static void main(String[] args) {
		// 사용자에게서 단어를 입력받아
		// 입력받은 총 단어의 개수를 출력하시오.
		// 단, 단어의 구분은 공백으로 한다.
		// 문자열을 입력하시오 : ab c def gh
		// ab, c,def,gh
		// 모두 4개의 단어가 있습니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 > ");
		
		String s = sc.nextLine();
		
		String[] arr = s.split(" ");
		
		for(String a : arr) { 
			System.out.println(a + ", ");
		}
		
		System.out.printf("\n모두 %d개의 단어가 있습니다.", arr.length);
	}
}
