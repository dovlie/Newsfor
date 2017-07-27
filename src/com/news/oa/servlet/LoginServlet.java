package com.news.oa.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.news.oa.dao.LoginDao;
import com.news.oa.model.Login;

import com.news.oa.dao.*;
import com.news.oa.model.*;
public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("gb2312");           //�����������
		response.setContentType("gb2312");                //������Ӧ����
		LoginDao loginDao= new LoginDao();
		MessboarDao messboarDao=new MessboarDao();
		HttpSession session=request.getSession();         // �Ȼ��user��������ǵ�һ�η��ʸ�Servlet���û�����϶�Ϊ�գ�������ǵ�
		Login l=(Login) session.getAttribute("login");    // ���������ǵ����Σ��Ͳ�Ӧ�����жϸ��û�����Ϣ
		String username=request.getParameter("name");
		session.setAttribute("name", username);
		System.out.println(username);
		if(l==null)
			l = loginDao.checkLogin(request.getParameter("name"),request.getParameter("password"));
		if(l!=null){                                      //�����½�ɹ�
			session.setAttribute("login",l);              //����ȡ�Ķ��󱣴���session��
			ArrayList al=messboarDao.findMbInfo();           //��ȡ���԰�����ݣ�����һ������
			System.out.println("��ȡ�ɹ�");
			session.setAttribute("al", al);               //�����鱣������
			response.sendRedirect("main.jsp");            //��֤�ɹ���ת�� main.jsp
		}
		else{                                             //��֤ʧ����ת�� error.jsp
			response.sendRedirect("error.jsp");
		}
		}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}
}
