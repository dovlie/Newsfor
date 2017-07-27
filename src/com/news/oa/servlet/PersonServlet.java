package com.news.oa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.news.oa.dao.*;
import com.news.oa.model.*;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("gb2312");           //�����������
		response.setContentType("gb2312");                //������Ӧ����
		
		PersonDao personDao=new PersonDao();
		HttpSession session=request.getSession();         // �Ȼ��user��������ǵ�һ�η��ʸ�Servlet���û�����϶�Ϊ�գ�������ǵ�
		//Login l=(Login) session.getAttribute("login");    // ���������ǵ����Σ��Ͳ�Ӧ�����жϸ��û�����Ϣ
		String username = request.getSession().getAttribute("name").toString();//תΪ�ַ���
		//session.setAttribute("name", username);
		
		System.out.println(username+"PersonServlet");
		//if(l==null)
			//l = loginDao.checkLogin(request.getParameter("name"),request.getParameter("password"));
	//	if(l!=null){                                      //�����½�ɹ�
			//session.setAttribute("login",l);              //����ȡ�Ķ��󱣴���session��
			ArrayList a3=personDao.findMbInfo(username);           //��ȡ���԰�����ݣ�����һ������
			session.setAttribute("a3", a3);               //�����鱣������
			request.setAttribute("a3", a3);
			//response.sendRedirect("personage.jsp");            //��֤�ɹ���ת�� main.jsp
			request.getRequestDispatcher("personage.jsp").forward(request, response);
		}
		//else{                                             //��֤ʧ����ת�� error.jsp
			//response.sendRedirect("error.jsp");
		//}
		
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
