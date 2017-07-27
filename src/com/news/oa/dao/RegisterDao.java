package com.news.oa.dao;
import java.sql.*;

import com.news.oa.factory.ConnectionFactory;
import com.news.oa.model.*;

import java.util.ArrayList;
public class RegisterDao {                                     //数据库连接对象
	PreparedStatement pstmt;
	public boolean insertUser(int id,String name,String password){
		try{
			Connection conn=ConnectionFactory.getConnection();
			pstmt=conn.prepareStatement("insert into loginss values(?,?,?,?)");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);				
			pstmt.setString(3, password);
			pstmt.setInt(4, 0);
			pstmt.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}