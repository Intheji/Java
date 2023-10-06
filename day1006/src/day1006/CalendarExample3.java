package day1006;

import java.util.Calendar;

public class CalendarExample3 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2023, 9, 6);
		System.out.println(toString(date));
		System.out.println("1일 후------");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
	
		System.out.println("6개월 전------");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// 다른 값에 영향을 주지 않음
		System.out.println("31일 후------");
		date.add(Calendar.DATE, -31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 "
				+ (date.get(Calendar.MONTH) + 1) + "월 "
				+ date.get(Calendar.DATE) + "일 ";
	}
}

