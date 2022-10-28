package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/apexondb","root","root");

		System.out.println("connected");
	}

}
