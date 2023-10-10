package day1010;

import java.util.ArrayList;

//Item 객체(이름, 가격)을 생성하여 장바구니 품목을 입력하고
//ArrayList객체를 통해 품목을 담고 출력하시오.
// * 장바구니 품목
// 이름	 	가격
// 티셔츠		15900
// 면바지   	58900
// 스니커즈 	87900
// 출력결과
// Item {name : 티셔츠, price : 15900}
// Item {name : 면바지, price : 58900}
// Item {name : 스니커즈, price : 87900}
// ======================================
// 총합 : 162700원
 


class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item {name : " + name + ", price : " + price + "}";
	}
	
	public int getPrice() {
		return price;
	}
}

public class ArrayList3 {
	public static void main(String[] args) {
		//item 객체생성
		Item shirt = new Item("티셔츠", 15900);
		Item pants = new Item("면바지", 58900);
		Item sneakers = new Item("스니커즈", 87900);
		
		//ArrayList 객체를 생성하고 Item 저장
		ArrayList<Item> cart = new ArrayList<Item>();
		cart.add(shirt);
		cart.add(pants);
		cart.add(sneakers);
		
		int sum = 0;
		for (int i=0; i<cart.size(); i++) {
			Item item = cart.get(i);
			System.out.println(cart.get(i).toString());
			sum += item.getPrice();
		}
		
		System.out.println("====================================");
		System.out.println("총합 : " + sum);
		
		
		//ArrayList cart = new ArrayList();
		
		ArrayList list = new ArrayList<String>();
		list.add("test");
		list.add(123);
		String str = (String) list.get(0);
		
		
	}
}
