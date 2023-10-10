package day1010;

import java.util.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
		Integer[] array = new Integer[100];
		System.out.println("배열 크기 : " + array.length);
		
		ArrayList list = new ArrayList(100);
		System.out.println("List 크기 : " + list.size());
		
		list.add(10);
		System.out.println("List 크기 : " + list.size());
	}
}
