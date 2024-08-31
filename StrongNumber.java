package day4;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int n=s.nextInt();
		int r=0;
		int t=n;
		while(t>0) {
		    int d=t%10;
		    int f=1;
		    for(int i=1;i<=d;i++) {
		    	f=f*i;
		    }
			r+=f;
			t=t/10;
		}
		if(r==n) {
       	 System.out.print("It is a Strong number");
        }
        else {
       	 System.out.print("It is  Not  a Strong number");
        }
        s.close();
	}

}
