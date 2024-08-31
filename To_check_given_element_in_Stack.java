package day7;
import java.util.*;
public class To_check_given_element_in_Stack {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=10;
		int c=4;
		boolean f=false;
		Stack<Integer> b=new Stack<>();
		for(int i=0;i<a;i++) {
			b.push(i);
		}
		for(int x:b) {
			if(c==x) {
				f=true;
			}
		}
		if(f==true) {
			System.out.println("Element found");
		}
		else {
				System.out.println("Not Element found");
			}
		
s.close();
	}

}
