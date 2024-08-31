package day7;

// Maximum and Minimum element in a  Stack

import java.util.*;

public class Max_Min_of_a_Stack {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the input");
        int a=s.nextInt();
        Stack<Integer> b=new Stack<>();
        for(int i=0;i<a;i++) {
        	b.push(s.nextInt());
        }
        int max=b.peek();
        int min=max;
        for(int x:b) {
        	if(x>=max) {
        		max=x;
        	}
        	if(x<=min) {
        		min=x;
        	}
        	
        	
        }
        System.out.println("The maximum element is"+max);
        System.out.println("The minimum element is"+min);
        s.close();
	}

}
