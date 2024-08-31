package day02;

import java.util.Scanner;

public class loopoddeven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the Starting number");
//		int a=s.nextInt();
//		System.out.println("Enter the Ending number");
//		int b=s.nextInt();
//		while(a<=b) {
//			if(a%2!=0) {
//				System.out.print(a+" ");
//				a=a+2;
//			}
//			else {
//			a++;}
//		}
		
		
		System.out.println("Enter the Starting number");
		int a=s.nextInt();
		System.out.println("Enter the Ending number");
		int b=s.nextInt();
		System.out.println("Enter the no of  number to be printed");
		int c=s.nextInt();
		while(c>0 && a<=b) {
			
			if(a%2==0) {
				System.out.print(a+" ");
				a+=2;
				c--;
			}
			else {
				a++;
			}
			
		}
		
s.close();
	}

}
