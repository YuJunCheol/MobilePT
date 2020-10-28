package DAO;

import VO.Member;

public class Insert extends DBConnection {
	
	public Insert() {
		
	}
	
	public Insert(Member member) {
		int r = 0;
		
		String sql ="INSERT INTO member(id,pw) VALUS(?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,member.getId());
			pstmt.setString(2, member.getPw());
			r = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("(!)[insert.member]: " + e.getMessage());
		}
	}
}
