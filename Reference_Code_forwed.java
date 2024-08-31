package day9;

public class Reference_Code_forwed {

	public static void main(String[] args) {
		// :: scope resolution operator
		A a=AA::new;
		a.Happy();
		
		A a1=AA::Ab;
		a1.Happy();
		
		AA b=new AA();
		A a2=b::Ac;
		a2.Happy();

	}

}
interface A{
	public void Happy(); 
}
class AA{
	public  AA() {
		System.out.print("Happy constructor\n");
	}
	 static void Ab() {
		System.out.print("Happy Static \n");
	}
	 public void Ac() {
			System.out.print("Happy Normal method\n");
		}
}
