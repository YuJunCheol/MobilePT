package DAO;

import VO.Member;

public class Select extends DBConnection{
	
	public boolean Checkmember(Member member) {
		String sql ="SELECT * FROM member";
		
		try {
			rs = st.executeQuery(sql);
			while(rs.next()) {
				if(member.getId().equals(rs.getString("id"))) {
					//System.out.println("O");
					return true;
				}else {
					return false;
				}
				
			}
			//System.out.println("X");
		}catch(Exception e) {
			System.out.println("(!)Select.Checkmember : ");
			e.printStackTrace();
		}
		return false;
	}

}
