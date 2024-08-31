package day7;

import java.util.Stack;

public class To_check_2_Stack_are_equal {

	public static void main(String[] args) {
		int a=10;
		Stack<Integer> c=new Stack<>();
		boolean f=false;
		Stack<Integer> b=new Stack<>();
		
		for(int i=0;i<a;i++) {
			b.push(i);
			c.push(i);
		}
		c.push(25);
		b.push(89);
		System.out.println(b+"\n"+c);
		boolean c1=false;
		for(int x:b) {
			f=false;
			for(int y:c) {
				if(x==y) {
					f=true;
					break;
				}
				else {
					f=false;
				}
			}
			if(f=true) {
				c1=true;
			}
			else {
				c1=false;
				break;
			}
			
		}
	
		if(c1=true) {
			System.out.println("Equal");
			
		}
		else {
			System.out.println("Not Equal");
		}
		
		
	}

}
