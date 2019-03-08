import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataBaseEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
			PreparedStatement preparedstatement = connection.prepareStatement("delete from employee where id=?");
			System.out.println("enter id");
			int id = sc.nextInt();
			preparedstatement.setInt(1, id);
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
