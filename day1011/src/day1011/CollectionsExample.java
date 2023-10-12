package day1011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExample {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i=1; i<=45; i++) {
			lotto.add(i);
		}
		
		System.out.println(lotto);
		
		Collections.shuffle(lotto);
		
		System.out.println(lotto);
		
		int[] lottoArr = new int[6];
		
		for(int i=0; i<lottoArr.length; i++) {
			lottoArr[i] = (int) lotto.remove(0);
		}
		
		String lottoStr = Arrays.toString(lottoArr);
		
		System.out.println("이번주 로또 번호 : " + lottoStr);
	}
}
