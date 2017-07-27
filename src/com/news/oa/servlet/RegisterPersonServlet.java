package com.news.oa.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.oa.dao.*;
public class RegisterPersonServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("gb2312");
			HttpSession session=request.getSession();
			int id=Integer.valueOf(request.getParameter("id"));
			String username=request.getParameter("name");
			session.setAttribute("name", username);
			System.out.println(username);
			String password=request.getParameter("password");
			if(new RegisterPersonDao().insertUser(id ,username, password)){
				System.out.println(id);
				response.sendRedirect("login.jsp");
			}
		}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
