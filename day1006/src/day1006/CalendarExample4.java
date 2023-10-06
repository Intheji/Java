package day1006;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("년도 입력 > ");
		int year = s.nextInt();
		
		System.out.print("월 입력 > ");
		int month = s.nextInt();
		
		int sDayOfWeek = 0;
		int endDay = 0;
		
		Calendar sDay = Calendar.getInstance();	//시작일
		Calendar eDay = Calendar.getInstance();	//종료일
		
		sDay.set(year, month-1, 1);	//이번 달
		eDay.set(year, month, 1);	//다음 달
		
		eDay.add(Calendar.DATE, -1);	// 이번 달의 마지막 날 찾기
		
		//1일이 무슨 요일인지 확인
		sDayOfWeek = sDay.get(Calendar.DAY_OF_WEEK);
		
		//마지막날의 일자만 가져옴
		endDay = eDay.get(Calendar.DATE);
		
		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//날짜 시작 전 공백 만들어주기
		for (int i=1; i < sDayOfWeek; i++) {
			System.out.print("   ");
		}
		
		for(int i=1, n=sDayOfWeek; i<=endDay; i++, n++) {
			System.out.printf("%3d", i);
			
			if (n % 7==0) {
				System.out.println();
			}
		}
	}
}
