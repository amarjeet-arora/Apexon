package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String update="update employee set email=?,city=? where name=?";
			
			//load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/apexondb","root","root");
			Employee emp= new Employee();
			emp.setName("Sam");
			emp.setCity("chennai");
			emp.setEmail("samNew12@mail.com");
			PreparedStatement stmt= conn.prepareStatement(update);
			
			stmt.setString(1,emp.getEmail());
			stmt.setString(2,emp.getCity());
			stmt.setString(3,emp.getName());
		 
			stmt.executeUpdate();
			System.out.println("employee updated");

			
		}
}
