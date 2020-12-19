package com.nidhi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ReminderBean.SetBean;
import com.database.ReminderDao;

/**
 * Servlet implementation class ViewReminder
 */
public class ViewReminder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewReminder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String str;
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

        str="Active";
		out.println("<html><head><title>View Reminder</title></head><body><h2>View Reminder </h2><br><br> <table border =2 height=60 width=100%  align=center cellspacing=2 cellpadding=15 >");

		List<SetBean> list=ReminderDao.view();
		out.println("<table'>");
		out.println("<tr ><th><b>Reminder Name</b></th><th><b>Reminder Subject</b></th><th><b>Reminder Description</b></th><th><b>Email Address</b></th><th><b>Contact No.</b></th><th><b>SMS No.</b></th><th><b>Status</b></th><th><b>Recurrence Frequency</b></th>   <th><b>Reminder Date</b></th></tr>");
		for(SetBean bean:list){
			
			  out.println("<tr><td>"+ bean.getname()+"</td><td>"+ bean.getsubject()+"</td><td>"+ bean.getdescription()+"</td><td>"+ bean.getemail()+"</td><td>"+ bean.getcontact_no()+"</td><td>"+ bean.getsms_no()+"</td><td>"+ str+"</td><td>"+ bean.getday()+"  Days</td><td>"+bean.getdate()+"</td></tr>");
			 
		}
		out.println("</table>");
		
		out.println("<br/><h3 align=\"center\"><input type=\"Button\"  onclick=\"window.location.href=\'HomePage.html\'\" value=\"Back\">     <input type=\"Button\"  onclick=\"window.location.href=\'DeleteReminder.html\'\" value=\"DeleteReminder\">      <input type=\"Button\"  onclick=\"window.location.href=\'DisableReminder.html\'\" value=\"DisableReminder\">       <input type=\"Button\"  onclick=\"window.location.href=\'ModifyReminder.html\'\" value=\"ModifyReminder\">             <a href=LogOut.html/>LogOut </a></h3></form></body></html>");
	out.close();
	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
