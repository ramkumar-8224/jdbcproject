package Project;
import java.util.Scanner;
import java.sql.*;

public class book{
	public Connection getconn1()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="root";
	String pass="root";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}
	Scanner sc1 = new Scanner(System.in);



	public void Student_deatil() throws SQLException {
			System.out.println("***Please Enter student  details***");
			 Connection con = getconn1();
			 String s1 = "insert into Student(id,name,dob,age,course_id) values(?,?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter  id:");
			             int id=sc1.nextInt();
			             System.out.println("Enter user name:");
			             String name =sc1.next();
			             System.out.println("Enter  date of birth");
			             String dob = sc1.next();
			             System.out.println("Enter age ");
			             int age=sc1.nextInt();
			             System.out.println("Enter course id ");
			             int course_id=sc1.nextInt();
			             
			       stmt.setInt(1,id);
			       stmt.setString(2,name);
			       stmt.setString(3,dob);
			       stmt.setInt(4,age);
			       stmt.setInt(5,course_id);
			       int a = stmt.executeUpdate();
			       System.out.println("***succues full entered***");
			       
		
	}

	public void Lecture_deatail() throws SQLException {
		System.out.println("***Please enter Lectures details***");
		 Connection con = getconn1();
		 String s1 = "insert into Lecture (Lecture_id,Lecture_name,Lecture_age,dateofjoining,course_id) values(?,?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter lecture id:");
		             int Lecture_id=sc1.nextInt();
		             System.out.println("Enter lecture name:");
		             String Lecture_name =sc1.next();
		             System.out.println("Enter lecture age");
		             int Lecture_age =sc1.nextInt();
		             System.out.println("Enter lecture date of join");
		             String dateofjoining= sc1.next();
		             System.out.println("Enter course id");
		             int course_id=sc1.nextInt();
		       stmt.setInt(1, Lecture_id);    
		       stmt.setString(2,Lecture_name );;
		       stmt.setInt(3,Lecture_age);
		       stmt.setString(4,dateofjoining);
		       stmt.setInt(5, course_id);
		       int a = stmt.executeUpdate();
		       System.out.println("***succues full entered***");
		
	}

	public void course_deatail() throws SQLException {
			System.out.println("***Please enter course details***");
			 Connection con = getconn1();
			 String s1 = "insert into course (course_id,course_name,cost) values(?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter course id");
			            int course_id =sc1.nextInt();
			             System.out.println("Enter course name");
			             String course_name =sc1.next();
			             System.out.println("Enter cost");
			             int cost = sc1.nextInt();
			            
			       stmt.setInt(1,course_id);
			       stmt.setString(2,course_name);
			       stmt.setInt(3,cost);
			       int a = stmt.executeUpdate();
			       System.out.println("***succues full entered***");
			
		}
	public void subject_detail() throws SQLException{
		System.out.println("enter the subject details");
		 Connection con = getconn1();
		 String s1="insert into subject(subject_id,subject_name,Lecture_id) values(?,?,?)";
		 PreparedStatement stmt=con.prepareStatement(s1);
		 System.out.println("enter the subject id");
		 int subject_id=sc1.nextInt();
		 System.out.println("enter the subject name");
		 String subject_name=sc1.next();
		 System.out.println("enter the lecture id");
		 int Lecture_id=sc1.nextInt();
		 stmt.setInt(1, subject_id);
		 stmt.setString(2, subject_name);
		 stmt.setInt(3,Lecture_id);
		 int a = stmt.executeUpdate();
		 System.out.println("succues full entered");
	}
		
	}

