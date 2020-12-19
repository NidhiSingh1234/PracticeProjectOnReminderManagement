package com.nidhi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ReminderBean.SetBean;
import com.database.ReminderDao;

/**
 * Servlet implementation class ModifyReminder
 */
public class ModifyReminder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyReminder() {
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
		  
		String date = request.getParameter("date");
		String subject = request.getParameter("Subject");
		String name = request.getParameter("name");
		String desc = request.getParameter("description");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact_no");
		String sms = request.getParameter("sms_no");
		String recur = request.getParameter("day");
		
		SetBean bean= new SetBean(date,subject,name, desc ,email,contact, sms , recur);
		int i=ReminderDao.update(bean);
		if(i>0){
			System.out.println("<h3>Reminder updated successfully</h3>");
			response.sendRedirect("Confirm.html");
		}
		else
		{
			System.out.println("You entered sms_no incorrectly");
		}
	}

}
