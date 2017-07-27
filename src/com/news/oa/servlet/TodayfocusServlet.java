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
 * Servlet implementation class TodayfocusServlet
 */
@WebServlet("/TodayfocusServlet")
public class TodayfocusServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("111");
		request.setCharacterEncoding("gb2312");           //�����������
		response.setContentType("gb2312");                //������Ӧ����
		MessboarDao messboarDao=new MessboarDao();
		HttpSession session=request.getSession();         // �Ȼ��user��������ǵ�һ�η��ʸ�Servlet���û�����϶�Ϊ�գ�������ǵ�
		              //����ȡ�Ķ��󱣴���session��
			ArrayList al=messboarDao.findMbInfo();           //��ȡ���԰�����ݣ�����һ������
			session.setAttribute("al", al);               //�����鱣������
			response.sendRedirect("main.jsp");            //��֤�ɹ���ת�� main.jsp
		
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
