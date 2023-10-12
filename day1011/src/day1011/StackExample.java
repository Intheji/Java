package day1011;

import java.util.Stack;

class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

public class StackExample {
	public static void main(String[] args) {
		Stack coinBox = new Stack();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//peek() : stack의 맨 위에 저장된 개체를 반환 (확인용)
		System.out.println(((Coin) coinBox.peek()).getValue());
		
		while(!coinBox.isEmpty()) {
			Coin c = (Coin) coinBox.pop();
			System.out.println("꺼내온 동전 : " + c.getValue());
		}
	}
}
