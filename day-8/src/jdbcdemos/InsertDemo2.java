package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String insert="insert into employee(name,email,city)values(?,?,?)";
			
			//load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/apexondb","root","root");
			Employee emp= new Employee("Sam", "sam@mail.com", "london");
			PreparedStatement stmt= conn.prepareStatement(insert);
			stmt.setString(1,emp.getName());
			stmt.setString(2,emp.getEmail());
			stmt.setString(3,emp.getCity());
			stmt.executeUpdate();
			System.out.println("employee added");

			
		}

}
