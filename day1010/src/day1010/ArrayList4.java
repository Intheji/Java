package day1010;

import java.util.Scanner;

//회원의 이름, 전화번호, 주소를 저장하는 Member클래스를 생성하고 
//사용자에게 메뉴룰 입력받아 리스트에 데이터를 처리하도록 설정
//메뉴
//1: 추가
//2: 검색 (이름을 입력받아 검색)
//3: 수정 (이름을 입력받아 전화번호와 주소를 변경)
//4: 삭제
//5: 전체 내용 출력
//6: 데이터 초기화
//7: 종료

class Member {
	private String name;
	private int number;
	private String addr;
	
	public Member(String name, int number, String addr) {
		this.name = name;
		this.number = number;
		this.addr = addr;
	}
	
	
}

public class ArrayList4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu==1) {
			
		} else if (menu==2) {
			
		} else if (menu==3) {
			
		} else if (menu==4) {
			
		} else if (menu==5) {
			
		} else if (menu==6) {
			
		} else if (menu==7) {
			
		} else {
			System.out.println("잘못 입력되었습니다. 1~7의 숫자를 입력해 주세요.");
		}
		
		
	}
}
