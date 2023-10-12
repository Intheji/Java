package day1011;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		
	}
}

public class QueueExample1 {
	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<Message>();
		
		msgQueue.offer(new Message("sendMail", "김그린"));
		msgQueue.offer(new Message("sendSMS", "이자바"));
		msgQueue.offer(new Message("senKakao", "정디비"));
		
		while(!msgQueue.isEmpty()) { 
			Message msg = msgQueue.poll();
			switch(msg.command) {
			case "sendMail" :
				System.out.println(msg.to + "님에게 메일을 보냈습니다.");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 문자를 보냈습니다.");
				break;
			case "sendKakao" :
				System.out.println(msg.to + "님에게 카톡을 보냈습니다.");
				break;
			}
		}
	}
}
