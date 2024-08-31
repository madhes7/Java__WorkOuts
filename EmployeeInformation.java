package DAO;
import java.util.*;
public class EmployeeInformation {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Employee ID: ");
			String emp_id=sc.nextLine();
			
			System.out.println("Employee Name: ");
			String emp_name=sc.nextLine();
			
			System.out.println("Department: ");
			String dept=sc.nextLine();
			
			System.out.println("Salary: ");
			double salary=sc.nextDouble();
			
			Employee emp=new Employee();
			emp.setEmp_id(emp_id);
			emp.setEmp_name(emp_name);
			emp.setDept(dept);
			emp.setSalary(salary);
			
			EmployeeInterface data_source=new NandhaEnggDAO();
			data_source.updateEmployee(emp);
		}
		catch(Exception obj) {
			obj.printStackTrace();
		}
	}

}
