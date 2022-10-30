package com.dao;

import java.util.List;

import com.model.Employee;

public interface UserDao {
	
	public void addUser(Employee emp);
	public List<Employee> loadEmp();

}
