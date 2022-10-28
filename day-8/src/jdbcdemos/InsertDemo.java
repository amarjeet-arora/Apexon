package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	String insert="insert into employee(name,email,city)values('admin','admin@mail.com','mumbai')";
		
		//load the driver
		
		Class.forName("com.mysql.jdbc.Driver");
		//establish the connection
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/apexondb","root","root");
		
		Statement stmt= conn.createStatement();
		stmt.executeUpdate(insert);
		System.out.println("employee added");

		
	}

}
