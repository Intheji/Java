package membership;

import java.sql.SQLException;

import common.JDBConnect;

public class MemberDAO extends JDBConnect{

	//생성자를 이용하여 DB연결
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}
	
	//입력한 아이디/패스워드가 일치하는 회원 정보를 반환
	public MemberDTO getMemberDTO(String uid, String upass) {
		
		//회원 정보DTO객체를 생성
		MemberDTO dto = new MemberDTO();
		
		//아이디와 패스워드가 일치하는 회원을 찾기위해 쿼리문 작성
		String query = "SELECT * FROM member WHERE id=? and pass=?";
		
		System.out.println(query);
		
		try {
			//쿼리 실행
			pstmt = con.prepareStatement(query); 
			pstmt.setString(1, uid);
			pstmt.setString(2, upass);
			rs = pstmt.executeQuery();
			
			if ( rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
		
	}
}







