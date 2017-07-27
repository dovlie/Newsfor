package com.news.oa.dao;
import java.sql.*;

import com.news.oa.model.MessBoar;

import com.news.oa.factory.ConnectionFactory;
import com.news.oa.model.*;

import java.util.ArrayList;

public class MessboarDao {                                     //数据库连接对象
	PreparedStatement pstmt;
	public  ArrayList<MessBoar> findMbInfo(){
		try{
			Connection conn=ConnectionFactory.getConnection();
			ArrayList<MessBoar> al=new ArrayList<MessBoar>();
			pstmt=conn.prepareStatement("select * from messagess");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				MessBoar mb=new MessBoar();
				mb.setId(rs.getInt(1));
				mb.setName(rs.getString(2));
				mb.setTime(rs.getDate(3));
				mb.setTitle(rs.getString(4));
				mb.setMessage(rs.getString(5));
				al.add(mb);
			}
			return al;
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
}
