package com.news.oa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.oa.factory.ConnectionFactory;

/**
 * Servlet implementation class modify
 */
@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
                                    //���ݿ����Ӷ���
	PreparedStatement pstmt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 boolean flag = false;
		//���session
	      HttpSession session = request.getSession();
	//���session�б�������Ϣ
	      String uid=request.getParameter("uid");
	      Integer.parseInt(uid);
	      System.out.println("�޸ĵ���Ϣ��");
	      System.out.println(uid);
	      String uname=request.getParameter("uname").toString();
	      System.out.println(uname);
	//��session�д洢����
	     //session.setAttribute("name","JACK");
		// TODO Auto-generated method stub
		String usex=request.getParameter("usex").toString();
		System.out.println(usex);
		String uborn=request.getParameter("uborn").toString();
		System.out.println(uborn);
		String uage=request.getParameter("uage").toString();
		System.out.println(uage);
		String uhome=request.getParameter("uhome").toString();
		System.out.println(uhome);
		
		try {
			
			Connection conn=ConnectionFactory.getConnection();
			pstmt=conn.prepareStatement("update person set id=?,name=?,sex=?,born=?,age=?,home=? where name=?");

			pstmt.setString(1, uid);                     //����SQL������
			pstmt.setString(2, uname);    
			pstmt.setString(3, usex);
			pstmt.setString(4, uborn);
			pstmt.setString(5, uage);
			pstmt.setString(6, uhome);
			pstmt.setString(7, uname);
			pstmt.executeUpdate();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("PersonServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
