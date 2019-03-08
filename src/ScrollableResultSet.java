import java.sql.Connection;
import java.sql.*;  
public class ScrollableResultSet {

	


	public static void main(String args[])throws Exception{  
	  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
	ResultSet rs=stmt.executeQuery("select * from user");  
	  
	//getting the record of 3rd row  
	rs.absolute(1);  
	System.out.println(rs.getLong(1)+" "+rs.getString(2)+" "+rs.getLong(3));  
	  
	con.close();  
	}}  

