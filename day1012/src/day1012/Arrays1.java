package day1012;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"ccc", "ddd"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"ccc", "ddd"}};
		
		//배열을 비교할 때
		//1차원 배열은 equals 사용, 다차원 배열은 deepEquals사용
		System.out.println(Arrays.equals(str2D, str2D2));		//얕은 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arrNum = {1,2,3,4,5};
		int[][] arrNum2D = {{11,22}, {33,44}};
		
		//1차원 배열을 출력할 때는 Arrays.toString()
		//다차원 배열을 출력할 때는 Arrays.deepToString() 사용
		System.out.println(arrNum);
		System.out.println(Arrays.toString(arrNum));
		System.out.println(Arrays.toString(arrNum2D));
		
		//배열복사
		int[] arrCopy = {0,1,2,3,4};
		int[] arrCopy2 = Arrays.copyOf(arrCopy, arrCopy.length);
		int[] arrCopy3 = Arrays.copyOf(arrCopy, 3);
		int[] arrCopy4 = Arrays.copyOf(arrCopy, 7);
		int[] arrCopy5 = Arrays.copyOfRange(arrCopy, 2, 4);
		int[] arrCopy6 = Arrays.copyOfRange(arrCopy, 0, 6);
		
		System.out.println("arrCopy : " + Arrays.toString(arrCopy));
		System.out.println("arrCopy2 : " + Arrays.toString(arrCopy2));
		System.out.println("arrCopy3 : " + Arrays.toString(arrCopy3));
		System.out.println("arrCopy4 : " + Arrays.toString(arrCopy4));
		System.out.println("arrCopy5 : " + Arrays.toString(arrCopy5));
		System.out.println("arrCopy6 : " + Arrays.toString(arrCopy6));
		// 나머지 공간은 0으로 채워서 나온다
		
		int[] arrSearch = {3,8,5,9,1};
		System.out.println(Arrays.binarySearch(arrSearch, 8));
		
		Arrays.sort(arrSearch);
		System.out.println(Arrays.toString(arrSearch));
		System.out.println("8의 위치 : " + Arrays.binarySearch(arrSearch, 8));

	}
}
