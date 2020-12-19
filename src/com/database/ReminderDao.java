package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ReminderBean.SetBean;

public class ReminderDao {
	
	public static int save(SetBean bean){
		int status=0;
		try{
			Connection con=Db.getCon();
			PreparedStatement ps=con.prepareStatement("insert into save_reminder values(?,?,?,?,?,?,?,?)");
			ps.setString(1,bean.getdate());
			ps.setString(2,bean.getsubject());
			ps.setString(3,bean.getname());
			ps.setString(4,bean.getdescription());
			ps.setString(5,bean.getemail());
			ps.setString(6,bean.getcontact_no());
			ps.setString(7,bean.getsms_no());
			ps.setString(8,bean.getday());

			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	public static List<SetBean> view(){
		List<SetBean> list=new ArrayList<SetBean>();
		try{
			Connection con=Db.getCon();
			PreparedStatement ps=con.prepareStatement("select * from save_reminder");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				SetBean bean=new SetBean();
				bean.setname(rs.getString("name"));
				bean.setsubject(rs.getString("subject"));
				bean.setdescription(rs.getString("description"));
				bean.setemail(rs.getString("email"));
				bean.setcontact_no(rs.getString("contact_no"));
				bean.setsms_no(rs.getString("sms_no"));
				bean.setday(rs.getString("day"));
				bean.setdate(rs.getString("date"));

				
				list.add(bean);
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return list;
	}
	public static int delete(String date, String subject , String sms_no){
		int status=0;
		try{
			Connection con=Db.getCon();
			PreparedStatement ps=con.prepareStatement("delete from save_reminder where date=? and Subject=? and sms_no=?");
			ps.setString(1,date);
			ps.setString(2,subject);
			ps.setString(3,sms_no);
			
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	public static int update(SetBean bean){
		int status=0;
		try{
			Connection con=Db.getCon();
			PreparedStatement ps=con.prepareStatement("update save_reminder set date=?, Subject=?, name=?, description=?, email=?, contact_no=?, day=? where sms_no=?");
			ps.setString(1,bean.getdate());
			ps.setString(2,bean.getsubject());
			ps.setString(3,bean.getname());
			ps.setString(4,bean.getdescription());
			ps.setString(5,bean.getemail());
			ps.setString(6,bean.getcontact_no());
			ps.setString(7,bean.getday());
			ps.setString(8,bean.getsms_no());

			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
}
