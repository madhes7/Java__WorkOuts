package day7;

import java.util.Scanner;
import java.util.Stack;

public class Swap_top_two_element_in_Stack {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=10;
		s.close();
		Stack<Integer> b=new Stack<>();
		for(int i=0;i<a;i++) {
			b.push(i);
		}
		int aa[]=new int[(b.size()/2)];
		
		
		System.out.println("Before Swap"+b);
		int x=b.pop();
		int y=b.pop();
		x=x+y;
		y=x-y;
		x=x-y;
		b.push(y);
		b.push(x);
		System.out.println("After  Swap Top two element"+b);
		int z=0;
		for(int i=0;i<(b.size()/2)-1;i++) {
			x=b.pop();
			y=b.pop();
			aa[z]=x;
			z++;
			aa[z]=y;
			z++;
		}System.out.println(b);
		 x=b.pop();
		 y=b.pop();
		
		b.push(x);
		b.push(y);
		for(int i=z+1;i>=0;i--) {
			b.push(aa[i]);
		}
		System.out.println("After  Swap Top two element"+b);
		
		
	}

}
