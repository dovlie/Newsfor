package com.news.oa.dao;
import java.sql.*;
import java.util.ArrayList;

import com.news.oa.model.Login;
import com.news.oa.model.MessBoar;

import com.news.oa.factory.ConnectionFactory;
import com.news.oa.factory.ConnectionFactory.*;
import com.news.oa.model.*;

public class LoginDao {
	
//	Connection conn=ConnectionFactory.getConnection();
	                                   //���ݿ����Ӷ���
	PreparedStatement pstmt;
	public Login checkLogin(String name,String password){ //��֤�û�������
		try{
			Connection conn=ConnectionFactory.getConnection();
			pstmt=conn.prepareStatement("select*from loginss where name=? " + " and password=?");
			pstmt.setString(1, name);                     //����SQL������
			pstmt.setString(2, password);                 //����SQL������
			ResultSet rs=pstmt.executeQuery();            //ִ�в�ѯ�����ؽ����
			if(rs.next()){                                //ͨ��JavaBean����ֵ
				Login login=new Login();
				login.setId(rs.getInt(1));
				login.setName(rs.getString(2));
				login.setPassword(rs.getString(3));
				login.setRole(rs.getInt(4));
				return login;                             //����JavaBean����
			}
			return null;                                  //��֤ʧ�ܷ���null
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public boolean addInfo(MessBoar mb){
		try{
			Connection conn=ConnectionFactory.getConnection();
			pstmt=conn.prepareStatement("insert into messagess values(?,?,?,?,?)");
			pstmt.setInt(1, mb.getId());
			pstmt.setString(2, mb.getName());
			pstmt.setDate(3, mb.getTime());
			pstmt.setString(4, mb.getTitle());
			pstmt.setString(5, mb.getMessage());
			pstmt.executeUpdate();
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
