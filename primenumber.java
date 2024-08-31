package day02;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a=s.nextInt();
		int i=2;
		int x=(a/2);
		int f=0;
		 if(a==0||a==1){  
			   System.out.println(a+" is not prime number");      
			  }
		 else{
			 while(i<=x) {
		 
			if(a%i==0) {
				System.out.print("Not a prime");
				f++;
				break;
			}
		}}
		if(f==0) {
			System.out.print(a+" Is a prime number");
		}
		s.close();

	}

}
