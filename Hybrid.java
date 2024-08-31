package day6;

class H1{
	void Hi() {
		System.out.println("Hi");
	}
	void Hello() {
		System.out.println("Hello");
	}
	
}

class Aa extends H1{
	
}

class Ab extends Aa{
	void Hello() {
		System.out.println("Hello");
	}
	
}

public class Hybrid extends Aa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hybrid hy=new Hybrid();
		hy.Hi();
		Ab a=new Ab();
		a.Hello();
	}

}