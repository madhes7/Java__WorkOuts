package day02;

import java.util.Scanner;

public class mullitpleofdegit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a=s.nextInt();
		int mul=1;
		while(a!=0) {
			mul=mul*(a%10);
			a=a/10;
		}
       System.out.println(mul);
	s.close();
	try {}
	finally{
		
	}
	}

}
