package day6;
class b{
	void disp1() {
		System.out.println("Hello");	
		}
}
class A1 extends b{
	void disp() {
		System.out.println("HIII");	
		}
}
public class Multilevel extends A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel s=new Multilevel();
		   s.disp();
		   s.disp1();

	}

}
