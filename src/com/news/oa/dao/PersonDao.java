package com.news.oa.dao;
import java.sql.*;


import com.news.oa.factory.ConnectionFactory;
import com.news.oa.model.*;

import java.util.ArrayList;


import com.news.oa.model.Login;
import com.news.oa.model.MessBoar;

import com.news.oa.factory.ConnectionFactory;
import com.news.oa.factory.ConnectionFactory.*;
import com.news.oa.model.*;

public class PersonDao {                                     //数据库连接对象
	PreparedStatement pstmt;
	public  ArrayList<Person> findMbInfo(String username){
		System.out.println(username+"111");
		try{
			Connection conn=ConnectionFactory.getConnection();
			ArrayList<Person> a3=new ArrayList<Person>();
			pstmt=conn.prepareStatement("select * from person where name=?");
			pstmt.setString(1, username);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Person mb3=new Person();
				mb3.setId(rs.getInt(1));//顺序一定要与数据库一致！
				mb3.setName(rs.getString(2));
				mb3.setSex(rs.getString(3));
				mb3.setBorn(rs.getDate(4));
				mb3.setAge(rs.getString(5));
				mb3.setHome(rs.getString(6));
				a3.add(mb3);
			}
			return a3;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public String getName(int id){
		String name=null;
		try{
			Connection conn=ConnectionFactory.getConnection();
			pstmt=conn.prepareStatement("select name from loginss where id=?");
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				 name=rs.getString(1);
			}
			return name;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public boolean modifyPerson(String uid,String uname,String usex,String uborn,String uage,String uhome){
		int id=Integer.parseInt(uid);
		try{
			Connection conn=ConnectionFactory.getConnection();
			pstmt=conn.prepareStatement("update person set id=?,name=?,sex=?,born=?,age=?,home=? where name=?");
			pstmt.setInt(1,id);
			pstmt.setString(2, uname);
			pstmt.setString(3,usex);
			pstmt.setString(4,uborn);
			pstmt.setString(5,uage);
			pstmt.setString(6, uhome);
			pstmt.setString(7, uname);
			pstmt.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
}
