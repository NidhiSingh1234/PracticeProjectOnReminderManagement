package com.nidhi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		out.println("User Name is :"+uname);
		out.println("<br/>Password is :"+pwd);
		if(uname.equals("Nidhi Singh") && pwd.equals("nidhi")){
		    response.sendRedirect("HomePage.html");
	     }
		else if(! pwd.contentEquals("nidhi")){
              response.sendRedirect("LoginFailed.html");
             }
		else
		{
			response.sendRedirect("Cancel.html");
		}
		

}
}
