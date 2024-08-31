package day02;

import java.util.Scanner;
public class ATM {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int h=0,th=0,f=0,t=0,te=0,n;
		n=sc.nextInt();

		if(n/200!=0) {
			th=n/200;
			n-=th*200;
		}
		if(n/100!=0) {
			h=n/100;
			n=n-(h*100);
		}
		if(n/50!=0) {
			f=n/50;
			n-=f*50;
		}
		if(n/20!=0) {
			t=n/20;
			n-=t*20;
		}
		if(n/10!=0) {
			te=n/10;
			n-=te*10;
		}
		System.out.println("Denomination:\nTwohundred:"+th+"\nHundred:"+h+"\nFifty:"+f+"\ntwenty:"+t+"\nTen:"+te+"\nTotal Notes:"+(h+th+f+t+te));
		sc.close();
	}
}
