package com.news.oa.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.news.oa.dao.PersonDao;

/**
 * Servlet implementation class ModifyPersonServlet
 */

public class ModifyPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String uid=request.getParameter("uid").toString();
	      
	      String uname=request.getParameter("uname").toString();
	      String usex=request.getParameter("usex").toString();
	      String uborn=request.getParameter("uborn").toString();
	      String uage=request.getParameter("uage").toString();
	      String uhome=request.getParameter("uhome").toString();
		
			request.setCharacterEncoding("gb2312");
			HttpSession session=request.getSession();
			int id=Integer.valueOf(request.getParameter("id"));
			String username=request.getParameter("name");
			session.setAttribute("name", username);
			System.out.println(username);
			String password=request.getParameter("password");
			if(new PersonDao().modifyPerson(uid ,uname, usex,uborn,uage,uhome)){
				System.out.println(id);
				response.sendRedirect("login.jsp");}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
