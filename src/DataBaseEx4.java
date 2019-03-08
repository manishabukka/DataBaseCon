import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseEx4 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet resultset = statement.executeQuery("select * from employee");
				PreparedStatement preparedstatement = connection.prepareStatement("update employee set age=? where salary=25000");
				System.out.println("enter age");
				int age = sc.nextInt();
				preparedstatement.setInt(1, age);
				int i = preparedstatement.executeUpdate();

				if (i == 1) {
					System.out.println("DONE");
				} else {
					System.out.println("ERROR");
				}

				connection.close();
			} catch (Exception e) {

			}

	}

}
