package day02;

import java.util.Scanner;

public class rangeprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int a=s.nextInt();
		System.out.println("Enter the Ending number");
		int b=s.nextInt();
		while(a<=b) {
			int i=2;
			int x=(a/2);
			int f=0;
			 if(a==0||a==1){  
				   System.out.println(a+" is not prime number");  
				   f++;
				  }
			 else{
				 while(i<=x) {
			 
				if(a%i==0) {
					
					f++;
					break;
				}
			i++;}}
			if(f==0) {
				System.out.println(a+" Is a prime number");
			}
			
    a++;
		}

		s.close();	}

}
