package com.database;
import java.sql.*;

public class Db {
	
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Reminder","root","#Nidhi1942");
			
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	}