package optionaldemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmpOptException {
	public static void main(String[] args) {
		List<Employee> emplist=createEmployee();
		
		
		Optional<Employee> employeeOpt= findEmp(emplist, "marti");
		
		Employee e1=employeeOpt.orElseThrow(() -> new RuntimeException("Employee Not found"));
		
	}
	public static Optional<Employee>findEmp(List<Employee>emps,String name) {
		for(Employee e:emps) {
			if(e.getName().equalsIgnoreCase(name)) {
				return Optional.of(e);
			}
		}
		return Optional.empty();
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
