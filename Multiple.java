package day6;

interface M1{
	abstract void m();
}
interface M2{
	abstract void m1();
	
}
class Ml implements M1,M2{
	public void m() {
		System.out.println("Byee");
	}
	public void m1() {
		System.out.println("Hello");
	}
}

public class Multiple  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ml m=new Ml();
       m.m();
       m.m1();
	}

}
