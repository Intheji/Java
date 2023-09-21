package day0921;

class Member {
	private String name;
	private String tel;
	private String address;
	
	public void printMember() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
		
	// getter : 멤버변수의 값을 읽어오는 역할
	public String getName() {
		return name;
	}
	
	// setter : 멤버변수의 값을 변경하는 역할
	public void setName(String name) {
		this.name = name;
	}
	
	// getter : 멤버변수의 값을 읽어오는 역할
	public String getTel() {
		return tel;
	}
	
	// setter : 멤버변수의 값을 변경하는 역할
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// getter : 멤버변수의 값을 읽어오는 역할
	public String getAddress() {
		return address;
	}
	
	// setter : 멤버변수의 값을 변경하는 역할
	public void setAddress(String addr) {
		this.address = addr;
	}
		
	
	
}


public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member();
		
		m.setName("김그린");
		m.setTel("010-1111-2222");
		m.setAddress("울산시");
		
		System.out.println(m.getName());
		System.out.println(m.getTel());
		System.out.println(m.getAddress());
	}
}
