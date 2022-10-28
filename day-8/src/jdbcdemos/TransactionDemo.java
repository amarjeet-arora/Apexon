package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) throws SQLException {

		String insert = "insert into employee(name,email,city)values(?,?,?)";
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apexondb", "root", "root");

			conn.setAutoCommit(false);

			Employee emp = new Employee("Sam", "sam@mail.com", "london");
			stmt = conn.prepareStatement(insert);
			stmt.setString(1, emp.getName());
			stmt.setString(2, emp.getEmail());
			stmt.setString(3, emp.getCity());

			Employee emp2 = new Employee("john", "john@mail.com", "mumbai");
			PreparedStatement stmt2 = conn.prepareStatement(insert);
			stmt2.setString(1, emp2.getName());
			stmt2.setString(2, emp2.getEmail());
			stmt2.setString(3, emp2.getCity());

			stmt.executeUpdate();
			stmt2.executeUpdate();

			conn.commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// stmt.close();
			// conn.close();
		}
		System.out.println("employee added");

	}
}
