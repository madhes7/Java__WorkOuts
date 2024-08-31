package DAO;
import java.util.*;
import java.sql.*;
public class NandhaEnggDAO implements EmployeeInterface {
	
	private Connection con=null;
	private PreparedStatement ps=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	public NandhaEnggDAO() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/customer","root","root");
		
	}
	public void addEmployee(Employee emp) throws Exception{
		String emp_id=emp.getEmp_id();
		String emp_name=emp.getEmp_name();
		String dept=emp.getDept();
		double salary=emp.getSalary();
		
		ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setString(1, emp_id);
		ps.setString(2, emp_name);
		ps.setString(3, dept);
		ps.setDouble(4, salary);
		
		int res=ps.executeUpdate();
		if(res>0) {
			System.out.println("Success...");
		}
	}
	public void updateEmployee(Employee emp) throws Exception{
		String emp_id=emp.getEmp_id();
		String emp_name=emp.getEmp_name();
		String dept=emp.getDept();
		double salary=emp.getSalary();
		
		ps=con.prepareStatement("update employee set employee_name=?,dept=?,salary=? where employee_id=?");
		ps.setString(4, emp_id);
		ps.setString(1, emp_name);
		ps.setString(2, dept);
		ps.setDouble(3, salary);
		
		int res=ps.executeUpdate();
		if(res>0) {
			System.out.println("Data updated Successfully...");
		}
	}
	public void deleteEmployee(Employee emp) throws Exception{
		
	}
	public List retrieveEmployee(Employee emp) throws Exception{
		return null;
		
	}

}
