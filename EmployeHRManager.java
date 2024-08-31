package day6;

class Employe{
	void work(String a) {
		System.out.println(a+" is a Employe");
	}
	void getSalary(int a) {
		System.out.println(a+" is a Employe Salary");
	}
}
class HRManager extends Employe{
	void work(String a) {
		System.out.println(a+" is a Employe");
	}
	void getSalary(int a) {
		System.out.println(a+" is a Employe Salary");
	}
	void addemploye(String a) {
		System.out.println(a+" is a added as Employe");
	}
}
public class EmployeHRManager {

	public static void main(String[] args) {
		HRManager h=new HRManager();
		Employe e=new Employe();
		 e.work("Dinesh");
		 e.getSalary(4000);
		 h.work("DineshMati");
		 h.getSalary(3000);
		 h.addemploye("Mati");
		 

	}

}
