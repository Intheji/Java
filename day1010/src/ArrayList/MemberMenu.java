package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	int idx = 0;
	
	public void menuProcess(ArrayList<Member> data) {
		while(true) {
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.전체 내용 출력 6.데이터 초기화 7.종료");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				Member m = infoInput();
				data.add(m);
				break;
			case 2:
				idx = search(data);
				if (idx>0) {
					printMember(data.get(idx));
				}
				break;
			case 3:
				editMember(data);
				break;
			case 4:
				delMember(data);
				break;
			case 5:
				for(int idx = 0; idx < data.size(); idx++) {
					printMember(data.get(idx));
				}
			case 6:
				delAllMember(data);
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	//case 1: 추가 기능
	public Member infoInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 > ");
		String name = sc.nextLine().trim();		// trim() : 양쪽 공백 제거
		
		System.out.println("전화번호 > ");
		String tel = sc.nextLine().trim();
		
		System.out.println("주소 > ");
		String address = sc.nextLine().trim();	
		
		return new Member(name, tel, address);
	}
	
	//case 2: 검색
	public int search(ArrayList<Member> data) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 > ");
		String name = sc.next();
		for (int i=0; i<data.size(); i++) {
			if (name.equals(data.get(i).getName())) {
				return i;
			}
		}
		
		System.out.println("일치하는 사람이 없습니다.");
		return -1;
	}
	
	//case 3: 변경
	public void editMember(ArrayList<Member> data) {
		Scanner sc = new Scanner(System.in);
		
		int idx = search(data);
		
		if (idx != -1) {
			System.out.println("새 전화번호 > ");
			String tel = sc.nextLine();
			System.out.println("새 주소 > ");
			String address = sc.nextLine();
			
			data.set(idx, new Member(data.get(idx).getName(), tel, address));
		}
	}
	
	//case 4: 삭제
	public void delMember(ArrayList<Member> data) {
		int idx = search(data);
		data.remove(idx);
	}
	
	//case 5: 전체 내용 출력 기능
	public void printMember(Member m) {
		System.out.println();
	}
	
	//case 6: 데이터 초기화
	public void delAllMember(ArrayList<Member> data) {
		data.removeAll(data);
	}

}
