package day1010;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		
		String formatNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		
		System.out.println(formatNow);
		
		int year = now.getYear();
		String month = now.getMonth().toString();
		int monthValue = now.getMonthValue();
		int dayOfMonth = now.getDayOfMonth();
		int dayOfYear = now.getDayOfYear();
		String dayOfWeek = now.getDayOfWeek().toString();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("monthValue : " + monthValue);
		System.out.println("dayOfMonth : " + dayOfMonth);
		System.out.println("dayOfYear : " + dayOfYear);
		System.out.println("dayOfWeek : " + dayOfWeek);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		
	}
}
