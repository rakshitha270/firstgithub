package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JDBCDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "12345");
		
		Statement st = con.createStatement();
		String query = "create table student3(ID int primary key,SName varchar(20), SMarks int)";
		String query1 = "insert into student3 values(1,'Rakshi',10)";
		//String query="select * from Student";
		ResultSet rs = st.executeQuery("SELECT ID,SMarks FROM Student");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		st.executeUpdate(query);
		
		System.out.println("Row inserted successfully");
		
		st.close();
		con.close();
	}

}
