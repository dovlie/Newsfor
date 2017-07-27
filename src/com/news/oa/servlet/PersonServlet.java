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
		request.setCharacterEncoding("gb2312");           //设置请求编码
		response.setContentType("gb2312");                //设置响应编码
		
		PersonDao personDao=new PersonDao();
		HttpSession session=request.getSession();         // 先获得user对象，如果是第一次访问该Servlet，用户对象肯定为空，但如果是第
		//Login l=(Login) session.getAttribute("login");    // 二次甚至是第三次，就不应该再判断该用户的信息
		String username = request.getSession().getAttribute("name").toString();//转为字符串
		//session.setAttribute("name", username);
		
		System.out.println(username+"PersonServlet");
		//if(l==null)
			//l = loginDao.checkLogin(request.getParameter("name"),request.getParameter("password"));
	//	if(l!=null){                                      //如果登陆成功
			//session.setAttribute("login",l);              //将获取的对象保存在session中
			ArrayList a3=personDao.findMbInfo(username);           //获取留言板的内容，返回一个数组
			session.setAttribute("a3", a3);               //把数组保存起来
			request.setAttribute("a3", a3);
			//response.sendRedirect("personage.jsp");            //验证成功跳转到 main.jsp
			request.getRequestDispatcher("personage.jsp").forward(request, response);
		}
		//else{                                             //验证失败跳转到 error.jsp
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
