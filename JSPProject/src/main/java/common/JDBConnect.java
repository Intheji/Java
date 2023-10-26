package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class JDBConnect {
	
	public Connection con; 	//DB와 연결
	public Statement stmt;	//인파라미터가 없는 정적 쿼리문 실행시 사용
	public PreparedStatement pstmt;	//인파라미터가 있는 동적 쿼리문 실행시 사용
	public ResultSet rs;	//select문의 결과를 저장할 때 사용
	
	//기본 생성자
	public JDBConnect() {
		try {
			
			//JDBC드라이버를 읽어옴
			Class.forName("oracle.jdbc.OracleDriver");
		
			//DB에 연결
			//오라클 프로토콜@ip주소:포트번호:sid
			//만약에 Mysql을 쓰고 싶으면 이걸 그 프로토콜로 바꾸면 된다 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "green";	//DB의 아이디
			String pwd = "1234";	//DB의 패스워드
			
			//실제로 오라클에 연결함
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB연결 성공! (기본생성자)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 두 번째 생성자
	public JDBConnect(String driver, String url, String id, String pwd) {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("DB 연결 성공(매개변수 생성자 1)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 세 번째 생성자
	public JDBConnect(ServletContext application) {
		try {
			String driver = application.getInitParameter("OracleDriver");
			Class.forName(driver);
			
			String url = application.getInitParameter("OracleDriver");
			String id = application.getInitParameter("OracleDriver");
			String pwd = application.getInitParameter("OracleDriver");
			
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB연결 성공(매개변수 생성자2)");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (pstmt != null) con.close();
			if (con != null) con.close();
			
			System.out.println("JDBC 자원 해제");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

