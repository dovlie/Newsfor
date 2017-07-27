package com.news.oa.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginCheckingFilter
 */
@WebFilter( "*.jsp" )
public class LoginCheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginCheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		HttpSession session=request.getSession();
		String uri=request.getRequestURI();
		System.out.println(uri);
		if(uri!=null&&(uri.equals("/register.jsp")||uri.equals(".js")||uri.equals(".css")||uri.equals("/login.jsp")||uri.equals("/main.jsp")||uri.equals("/loginServlet"))){
			chain.doFilter(req, res);
		}else{
			if(session==null){
				response.sendRedirect("/login.jsp");
			}else{
				String username=(String) session.getAttribute("name");
				if(username==null){
					response.sendRedirect("/login.jsp");
				}else{
					System.out.println("222");
					chain.doFilter(req, res);
				}
			}
		}
	}


	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

