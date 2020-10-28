package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConnection {

	protected Connection con = null;
	protected Statement st = null;
	protected ResultSet rs = null; 
	protected PreparedStatement pstmt = null; 
	
	public DBConnection () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobilepersonaltrainer?useSSL=false","root","1234");
			st = con.createStatement();
		}catch(Exception e) {
			System.out.println("(ERROR)DB.DBConnection: ");
			e.printStackTrace();
		}
	}
	
}
