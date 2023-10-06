package day1006;

import java.util.Calendar;

public class CalendarExample2 {
	public static void main(String[] args) {
		final String[] WEEK = {"", "일", "월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();	// 기준일
		Calendar date2 = Calendar.getInstance();	// 오늘날짜
		
		date1.clear(); // 기준일 초기화
		System.out.println(date1);		// 사는 곳을 기준으로 설정값이 생긴다
		date1.set(1996, 12, 22);
		
		System.out.println("date1은 " + toString(date1) + WEEK[Calendar.DAY_OF_WEEK] + "요일이고");
		System.out.println("date2은 " + toString(date2) + WEEK[Calendar.DAY_OF_WEEK] + "요일입니다.");
		
		// 밀리초단위 계산
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("date1부터 date2까지" + diff + "초 지났습니다.");
		System.out.println("일로 계산하면 " + diff / (60*60*24) + "일 지났습니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 "
			+ (date.get(Calendar.MONTH) + 1) + "월 "
			+ date.get(Calendar.DATE) + "일 ";
	}
}
