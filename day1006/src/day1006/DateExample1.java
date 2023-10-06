package day1006;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println();
		
		String a = now.toString();
		System.out.println(a);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String strNow = sdf.format(now);
		System.out.println(strNow);
	}
}
