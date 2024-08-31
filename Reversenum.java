package day4;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int r=0;
		int t=n;
		while(t>0) {
			int d=t%10;
			r=r*10+d;
			t=t/10;
		}
         System.out.print(r);
         s.close();
	}

}
