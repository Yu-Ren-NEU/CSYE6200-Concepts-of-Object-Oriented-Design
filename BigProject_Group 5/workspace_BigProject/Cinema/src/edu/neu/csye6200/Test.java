package edu.neu.csye6200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void demo() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		 try {
	            // The newInstance() call is a work around for some
	            // broken Java implementations
 
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("加载成功");
	        } catch (Exception ex) {
	        	System.out.println("加载失败");
	            // handle the error
	        }
		
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost:3306/Workspace_Cinema?serverTimezone=UTC","root","shayatou123");
		       //此处test为mysql提前建立的数据库，root为用户名，最后为密码
 
		   System.out.println("连接成功");
		   
		 //一下测试输出数据库内数据，提前在数据库内建立user表，添加num和name
		   ps = conn.prepareStatement("select * from user where userid = " + 1 + ";");
		   rs = ps.executeQuery();
		   while(rs.next()) {
			   int num = rs.getInt("userid");
			   String name = rs.getString("username");
			   System.out.print(num+"\t"+name);
			   System.out.println("");
		   }
		   
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		    System.out.println("连接失败");
		}
	}

}
