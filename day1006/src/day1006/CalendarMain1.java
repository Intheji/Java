package day1006;

import java.util.Scanner;
import java.util.*;
class CalendarTest{
	public int year;  //사용자 입력 "년"
	public int month;  //사용자 입력 "달"
	public int lastDay;   //month의 마지막 일
	public int startWeek;  //month의 시작 요일
	CalendarTest(int year, int month){  //생성자를 통해 받기
		this.year=year;
		this.month=month;
	}
	//필드의 값을 찾아 저장하는 메소드
	public void find(){
		Calendar day = Calendar.getInstance();
		//사용자 지정요일 값을 입력함
		day.set(year, month-1,1);
		//입력받은 달의 마지막 일 수 계산(30일, 31일 등)
		this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH);
		//1이면 일요일, 2이면 월요일 ...순으로 입력 월의 시작 요일값 저장
		this.startWeek = day.get(day.DAY_OF_WEEK);
	}
	public void display(){
		System.out.println("SU\tMO\tTU\tWE\tTH\tFR\tSA");
		//출력할 일 수
		int day=1;
		switch(startWeek){
			case 7:System.out.print(" \t");
			case 6: System.out.print(" \t");
			case 5: System.out.print(" \t");
			case 4: System.out.print(" \t");
			case 3: System.out.print(" \t");
			case 2: System.out.print(" \t");
		}
		//스타트 위치 지정
		int countDay=startWeek;
		for(int i=1;i<=lastDay;i++){
			System.out.print(i+"\t");
			if(countDay%7==0){
				System.out.println();
			}
			countDay++;
		}
	}
}


public class CalendarMain1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("년도 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		System.out.println("\t\t" + year + "년 " + month + "월");
		CalendarTest c = new CalendarTest(year, month);
		c.find();
		c.display();
	}
}
