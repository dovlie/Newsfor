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
		request.setCharacterEncoding("gb2312");           //设置请求编码
		response.setContentType("gb2312");                //设置响应编码
		MessboarDao messboarDao=new MessboarDao();
		HttpSession session=request.getSession();         // 先获得user对象，如果是第一次访问该Servlet，用户对象肯定为空，但如果是第
		              //将获取的对象保存在session中
			ArrayList al=messboarDao.findMbInfo();           //获取留言板的内容，返回一个数组
			session.setAttribute("al", al);               //把数组保存起来
			response.sendRedirect("main.jsp");            //验证成功跳转到 main.jsp
		
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
