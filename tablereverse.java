package day02;

import java.util.Scanner;

public class tablereverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number");
		int a=s.nextInt();
		System.out.println("Enter the  range");
		int b=s.nextInt();
		while(b>0) {
			System.out.println(a+" * "+b+" = "+(a*b));
			b--;
			
		}

s.close();}

}
