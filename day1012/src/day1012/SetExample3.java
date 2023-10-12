package day1012;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample3 {
	public static void main(String[] args) {
		//1~30 사이의 숫자를 이용하여 빙고판을 생성하고
		// 숫자가 중복되지 않도록 5*5 형태의 2차원배열을 생성하여 출력
	
		
		Set set = new HashSet();
		
		int[][] board = new int[5][5]; 	// 5*5배열 선언
		
		for (int i=0; set.size()<25; i++) {
			int num = (int) (Math.random()*30) + 1;
			set.add(num);
 		}
		
		ArrayList list = new ArrayList(set);
		
		Collections.shuffle(list);
		
		Iterator it = list.iterator();
		
		for (int i=0; i<board[0].length; i++) {
			for (int j=0; j<board[0].length; j++) {
				board[i][j] = (int) it.next();
				
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
				
				
				
//				if (board[i][j] < 10) {
//					System.out.print("  " + board[i][j]);
//				} else {
//					System.out.print(" " + board[i][j]);
//				}
			}
			System.out.println();
		}
		
	}
}
