package day1006;

import java.util.Calendar;
import java.util.Scanner;

class Calender1 {
	int year;
	int month;
	int lastDay;
	int startWeek;
	void Calendar(int year, int month){ 
		this.year = year;
		this.month = month;
	}
	
	public void Calender2() {
		Calendar day = Calendar.getInstance();
		day.set(year, month-1,1);
		this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH);
		this.startWeek = day.get(day.DAY_OF_WEEK);
	}
	
	
} 

public class CalendarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
	}
}
