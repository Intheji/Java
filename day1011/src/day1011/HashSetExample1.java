package day1011;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		
		Object[] objArr = {"1", 1, "2", "2", "3", "3", "3", "4", "4"};
		Set set = new HashSet();	//HashSet set = new HashSet(); 해도 되지만 다형성 이용
		
		for (int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i] + " : " + set.add(objArr[i]));
		}
		
		System.out.println("-----------");
		
		System.out.println(set);
		
		
	}
}

