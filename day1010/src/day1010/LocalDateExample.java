package day1010;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		
		//현재 날짜
		LocalDate now = LocalDate.now();
		
		//지역별 현재 날짜 구하기
		LocalDate seoulNow = LocalDate.now(ZoneId.of("Asia/Seoul"));
		LocalDate nyNow = LocalDate.now(ZoneId.of("America/New_York"));
		LocalDate sdNow = LocalDate.now(ZoneId.of("Europe/Stockholm"));
		
		System.out.println(now);
		System.out.println(seoulNow);
		System.out.println(nyNow);
		System.out.println(sdNow);
		
		//형식 정의
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatNow = now.format(fomatter);
		
		System.out.println(formatNow);
		
		int year = now.getYear();
		String month = now.getMonth().toString();
		int monthValue = now.getMonthValue();
		int dayOfMonth = now.getDayOfMonth();
		int dayOfYear = now.getDayOfYear();
		String dayOfWeek = now.getDayOfWeek().toString();
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("monthValue : " + monthValue);
		System.out.println("dayOfMonth : " + dayOfMonth);
		System.out.println("dayOfYear : " + dayOfYear);
		System.out.println("dayOfWeek : " + dayOfWeek);
	}
}
