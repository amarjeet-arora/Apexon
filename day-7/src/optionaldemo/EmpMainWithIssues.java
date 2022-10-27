package optionaldemo;

import java.util.ArrayList;
import java.util.List;

public class EmpMainWithIssues {
	public static void main(String[] args) {
		List<Employee> emplist=createEmployee();
		Employee employee= findEmp(emplist, "marti");
		System.out.println("Employee Name  "+ employee.getName());
		
	}
	public static Employee findEmp(List<Employee>emps,String name) {
		for(Employee e:emps) {
			if(e.getName().equalsIgnoreCase(name)) {
				return e;
			}
		}
		return null;
	}
	
	public static List<Employee> createEmployee(){
		List<Employee> emplist= new ArrayList<Employee>();
		emplist.add(new Employee("martin", "21"));
		emplist.add(new Employee("Mary", "22"));
		emplist.add(new Employee("Stephan", "31"));
		emplist.add(new Employee("Gary", "26"));
		return emplist;
	}

}
