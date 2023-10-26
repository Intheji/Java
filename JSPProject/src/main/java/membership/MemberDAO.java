package membership;

import java.sql.SQLException;

import common.JDBConnect;

public class MemberDAO extends JDBConnect{

	//생성자를 이용하며 DB연결
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}
	
	//입력한 아이디/패스워더가 일치하는 회원정보를 반환
	public MemberDTO getMemberDTO(String uid, String upass) {
		
		//회원정보DTO 객체를 생성
		MemberDTO dto = new MemberDTO();
		
		//아이디와 패스워드가 일치하는 회원을 찾기 위해 쿼리문 작성
		String query = "SELECT * FROM member WHERE id=? and pass=?";
		
		System.out.println(query);
		
		//쿼리 실행
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, uid);
			pstmt.setString(2, upass);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setRegidate(rs.getString("ragidate"));
				//괄호 안에 숫자를 넣어도 된다
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	}
}
