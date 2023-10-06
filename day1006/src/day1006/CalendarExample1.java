package day1006;

import java.util.Calendar;

public class CalendarExample1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		
		System.out.println(year + "년 ");
		System.out.println(month + "월 ");
		System.out.println(day + "일 ");
		
		// 일요일 : 1
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		String strWeek = null;
		
		switch(week) {
			case 1:
				strWeek = "일요일";
				break;
			case 2:
				strWeek = "월요일";
				break;
			case 3:
				strWeek = "화요일";
				break;
			case 4:
				strWeek = "수요일";
				break;
			case 5:
				strWeek = "목요일";
				break;
			case 6:
				strWeek = "금요일";
				break;
			case 7:
				strWeek = "토요일";
				break;
		}
		
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
		
		// 오전 : 0 , 오후 : 1
		if (amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		System.out.println(amPm);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	}
}
