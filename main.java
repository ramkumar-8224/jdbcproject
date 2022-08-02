package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class main {

	public static void main(String[] args) throws SQLException{
		
		// TODO Auto-generated method stub
		String s="y";
		String p="y";
		outer: while (p.equals("y")) {
		Scanner sc=new Scanner(System.in);
		book b=new book();
		userdisplay d1=new userdisplay();
		System.out.println("Enter your login deatils user login or Admin login");
		String Role=sc.next();
		if(Role.equals("Admin"))
		{
			System.out.println("you Enter Admin login");
			
			Connection con=b.getconn1();
			PreparedStatement st=con.prepareStatement("Select * from Admin");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				String loginuser=rs.getString("user_name");
				String Loginpass=rs.getString("password");
				System.out.println("please enter user name");
				String username=sc.next();
				System.out.println("please enter Password");
				String password=sc.next();
				if(loginuser.equals(username)&&Loginpass.equals(password) )
				{
					System.out.println("welcome into Admin login");
					
					
					while (s.equals("y")) {
						System.out.println("SERVICES PROVIDED BY US");
						System.out.println("press 1 to choose Studentdeatail");
						System.out.println("press 2 to choose Lecture_deatail");
						System.out.println("press 3 to choose course_deatail ");
						System.out.println("press 4 to choose subject_detail");

						
						int i = sc.nextInt();

						book bb = new book();

						switch (i) {
						case 1: 
							bb.Student_deatil();
						    break;
						case 2:
							bb.Lecture_deatail();
						    break;
						case 3: 
							bb.course_deatail();
						    break;
						case 4:
							bb.subject_detail();
							break;
						case 5:
							System.exit(0);
						default : 
							System.out.println("Wrong Choice");
							
						    break;
						    
					}
						System.out.println("you want contione or stop y or no");
						String n=sc.next();
						if(n.equals("n"))
						{
							
							break;
						}
						else
						{
							System.out.println("you Entered wrong password");
						}
						
					
					}
					
				
				}
				
			}
			
			
		}
		else if(Role.equals("user"))
		{
			Connection con=d1.getconn();
			PreparedStatement st=con.prepareStatement("Select * from Admin");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				String loginuser=rs.getString("user_name");
				String Loginpass=rs.getString("password");
				System.out.println("please enter user name");
				String username=sc.next();
				System.out.println("please enter Password");
				String password=sc.next();
				if(loginuser.equals(username)&&Loginpass.equals(password) )
				{
					System.out.println("welcome into user login");
					
					while (s.equals("y")) {
						System.out.println("SERVICES PROVIDED BY US");
						System.out.println("press 1 to choose displayStudentdeatail");
						System.out.println("press 2 to choose Lecture_deatail");
						System.out.println("press 3 to choose course_deatail ");
						System.out.println("press 4 to choose subject_detail");
						userdisplay d=new userdisplay();
						int i = sc.nextInt();
								int count=0;
						switch (i) {
						case 1: 
							d1.displaystudentdeatail();
						    break;
						case 2:
							d1.displayLecturedetails();
						    break;
						case 3: 
							d1.displaycourse_deatail();
						    break;
						case 4:
							d1.displaysubject_detail();
							break;
						case 5:
							System.exit(0);
						default : 
							System.out.println("Wrong Choice");
						    break;
						    
					}
						System.out.println("you want contione or stop y or no");
						String n=sc.next();
						if(n.equals("n"))
						{
							
							break;
						}
						
						
					}
					
					
				}
				
				
       
				else
				{
					System.out.println("you Entered wrong password");
			
				}
			
				
		}
			
			
			
		}
		else
			
		{
			System.out.println("you entered wrong role");
			
			
		}
		
		/*else
		{
			System.out.println("you entered wrong role");
			String p1=sc.next();
			
		}*/
		System.out.println("Do you want to continue then press y/n");
		
		String n =sc.next();
		if (n.equals("n"))
		{
		    
			System.out.println("******Session closed*******");

		    break outer ;
		}
	}
		
		
	}
	}

