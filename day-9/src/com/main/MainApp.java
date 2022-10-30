package com.main;

import java.util.List;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		 UserDao ud= new UserDaoImpl();
		 //ud.addUser(new Employee("Jose", "Jose@mail.com", "NY"));
		 List<Employee> emp= ud.loadEmp();
		 for(Employee em:emp) {
			 System.out.println(em);
		 }

	}

}
