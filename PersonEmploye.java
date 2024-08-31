package day6;

import java.util.Scanner;
class Person{
	void getFirstName(String str) {
		System.out.println("FirstName: "+str);
	}
	void getLastName(String str) {
		System.out.println("LastName: "+str);
	}
}
class Employee1 extends Person{
	void getEmployeeId(int a) {
		System.out.println("Emp Id: "+a);
	}
	void getLastName(String s,String title) {
		System.out.println("Lastname: "+s+" title: "+title);
	}
}
public class PersonEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter FirstName:");
		String a=sc.nextLine();
		System.out.println("Enter LastName:");
		String b=sc.nextLine();
		System.out.println("Enter EmployeeId:");
		int a1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter JobTitle:");
		String c=sc.nextLine();
		Employee1 e=new Employee1();
		e.getFirstName(a);
		e.getLastName(b);
		e.getEmployeeId(a1);
		e.getLastName(b,c);
		sc.close();
	}

}
