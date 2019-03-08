

import com.mysql.cj.jdbc.PreparedStatement;
import java.sql.*;
import java.util.Scanner;

public class DataBaseEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			java.sql.PreparedStatement preparedstatement = connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			System.out.println("enter contact_no");
			int phno=sc.nextInt();
			System.out.println("enter address");
			String add=sc.next();
			System.out.println("enter salary");
			int sal=sc.nextInt();
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2,name);
			preparedstatement.setInt(3, age);
			preparedstatement.setInt(4, phno);
			preparedstatement.setString(5,add);
			preparedstatement.setInt(6, sal);
			
			 int i=preparedstatement.executeUpdate();
			 
			 if(i==1)
			 {
				 System.out.println("DONE");
			 }else {
				 System.out.println("ERROR");
			 }
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
