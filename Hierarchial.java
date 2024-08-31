package day6;

class A2{
	void Hi() {
		System.out.println("Hi");
	}
	void Hello() {
		System.out.println("Hello");
	}
}

class A3 extends A2{
	
}

public class Hierarchial extends A3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarchial h=new Hierarchial();
		h.Hi();
		A2 a=new A2();
		a.Hello();
	}

	

}
