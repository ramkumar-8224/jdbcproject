package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class userdisplay{  
	
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="ramuser";
	String pass="ram12345";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}
		public void displaystudentdeatail() throws SQLException
		{
			Connection con=getconn();
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));  
		}
		public void  displayLecturedetails() throws SQLException
		{
			Connection con=getconn();
			
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from Lecture");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));  
		}
		public void displaycourse_deatail() throws SQLException
		{
        Connection con=getconn();
			
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select * from  course");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
		}
		public void displaysubject_detail() throws SQLException
		{
			 Connection con=getconn();
				
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select * from subject");  
				while(rs.next())  
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)); 
		}
		

	

}
