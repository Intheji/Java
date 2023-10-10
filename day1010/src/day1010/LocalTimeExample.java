package day1010;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formatNow = now.format(formatter);
		System.out.println(formatNow);
		
		int hour = now.getHour();
	}
}
