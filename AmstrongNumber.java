package day4;

import java.util.Scanner;


public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
			
			int n=s.nextInt();
			int r=0;
			int t=n;
			while(t>0) {
				
				r++;
				t=t/10;
			}
	         t=n;
	         int r1=0;
	         while(t>0) {
	 			int d=t%10;
	 			t=t/10;
	 			r1=r1+ (int)Math.pow(d,r);
	 		}
	         if(r1==n) {
	        	 System.out.print("It is a amstrong number");
	         }
	         else {
	        	 System.out.print("It is  Not  a amstrong number");
	         }
	         s.close();
		}

	}


