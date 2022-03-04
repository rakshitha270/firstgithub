package jdbc1;


import java.sql.*; 

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "12345");
		
		Statement st = con.createStatement();
		String query = "create table student2(ID int primary key,SName varchar(20), SMarks int)";
		String query1 = "insert into student2 values(1,'Rakshi',10)";
		String query2 = "insert into student2 values(2,'nivi',20)";
		st.executeUpdate(query2);
		System.out.println("Student2 Table created successfully");
		
	System.out.println("Row inserted successfully");
		
	st.close();
	con.close();
	}

}


