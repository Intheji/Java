package ArrayList;

import java.util.ArrayList;

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

public class ArrayListmain {
	public static void main(String[] args) {
		ArrayList<Member> data = new ArrayList<Member>();
		MemberMenu mm = new MemberMenu();
		mm.menuProcess(data);
	}
}
