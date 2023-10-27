package board;

import java.sql.Date;

//DTO : 데이터의 전송이나 저장을 위한 객체
//코드를 가지고 있지 않음(멤버변수, getter/setter)
public class BoardDTO {

	private String num;
	private String title;
	private String content;
	private String id;
	private Date postdate;
	private String visitcount;
	//이름을 출력하기 위해 다른 테이블의 필드 추가 (join)
	private String name;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getPostdate() {
		return postdate;
	}
	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	public String getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(String visitcount) {
		this.visitcount = visitcount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
