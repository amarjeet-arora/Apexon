package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/apexondb","root","root");
		Statement stm= conn.createStatement();
		ResultSet rs= stm.executeQuery("select * from employee");
		
		while(rs.next()) {
			Employee emp= new Employee(rs.getString(1), rs.getString(2), rs.getString(3));
			al.add(emp);
			
			 }
		for(Employee em:al)
		System.out.println(em);
}

}
