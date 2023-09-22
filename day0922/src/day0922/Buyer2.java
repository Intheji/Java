package day0922;

import java.util.Arrays;

public class Buyer2 {
	
	int money = 10000;
	int bonusPoint = 0;
	
//	int[] arr = new int[5];		// 정수를 저장하는 배열
//	int[] arr2 = {1,2,3,4,5};
	
	
	Product[] cart = new Product[10];	// product를 저장하는 배열
	int i = 0;
	
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		
		System.out.println(p + "를 구매하였습니다.");
//		System.out.println(Arrays.toString(cart));
	}
	
	void Summary() {
		int sum = 0;	// 물건의 합계
		String itemList = ""; // 구입한 물건의 목록
		
		for (int i=0;i<cart.length;i++) {
			
			if (cart[i] == null) {
				break;
			}
			
			itemList += (i==0) ? cart[i] :  ", " + cart[i];
			sum += cart[i].price;
			
		}
		
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		System.out.println("구입하신 제품의 총 금액은 " + sum + "입니다.");
	}
	
}
