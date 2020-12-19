package com.ReminderBean;

public class SetBean {
	private String date,subject,name,description,email,contact_no,sms_no,day;
	public SetBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SetBean(String date, String subject, String name,String description, String email, String contact_no, String sms_no, String day) {
		super();
		this.date = date;
		this.subject = subject;
		this.name=name;
		this.description = description;
		this.email = email;
		this.contact_no = contact_no;
		this.sms_no = sms_no;
		this.day=day;
	}
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getsubject() {
		return subject;
	}
	public void setsubject(String subject) {
		this.subject = subject;
	}	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getcontact_no() {
		return contact_no;
	}
	public void setcontact_no(String contact_no ) {
		this.contact_no = contact_no;
	}
	public String getsms_no() {
		return sms_no;
	}
	public void setsms_no(String sms_no) {
		this.sms_no = sms_no;
	}
	
	public String getday() {
		return day;
	}
	public void setday(String day) {
		this.day = day;
	}
	
}
