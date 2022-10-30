package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dal.DBConnnection;
import com.model.Employee;

public class UserDaoImpl implements UserDao {
	DBConnnection dbcon = new DBConnnection();
	Connection conn = dbcon.getConnection();

	@Override
	public void addUser(Employee emp) {
		try {
			String insert = "insert into employee(name,email,city)values(?,?,?)";

			PreparedStatement stmt = conn.prepareStatement(insert);
			stmt.setString(1, emp.getName());
			stmt.setString(2, emp.getEmail());
			stmt.setString(3, emp.getCity());
			stmt.executeUpdate();
			System.out.println("employee added");
		} catch (Exception e) {
		}

	}

	@Override
	public List<Employee> loadEmp() {
		ArrayList<Employee> al = new ArrayList<Employee>();
		try {

			String query = "select * from employee";
			PreparedStatement stm = conn.prepareStatement(query);
			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee(rs.getString(1), rs.getString(2), rs.getString(3));
				al.add(emp);

			}
		} catch (Exception e) {
		}
		return al;
	}

}
