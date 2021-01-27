package com.klu.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;

public class StudentInsertion {
	
	public int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException{
		
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");  
		ps.setInt(1,student.getReg_no());
		ps.setString(2,student.getName());
		ps.setString(3,student.getEmail());
		int i = ps.executeUpdate();
		con.close();
		return i;
	}
}
