package DAO;
import java.util.*;
public interface EmployeeInterface {
	
	public void addEmployee(Employee emp) throws Exception;
	public void updateEmployee(Employee emp) throws Exception;
	public void deleteEmployee(Employee emp) throws Exception;
	public List retrieveEmployee(Employee emp) throws Exception;
}
