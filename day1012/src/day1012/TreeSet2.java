package day1012;

import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("ddd");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to + "zzzz"));
		
		System.out.println();
		
		TreeSet iSet = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 60, 10, 100};
		
		for(int i=0; i<score.length; i++) {
			iSet.add(score[i]);
		}
		
		System.out.println(iSet);
		
		System.out.println("50보다 작은 값" + iSet.headSet(50));
		System.out.println("50보다 큰 값" + iSet.tailSet(50));
		System.out.println("45~60 사이의 큰 값" + iSet.subSet(45, 60));
	}

}
