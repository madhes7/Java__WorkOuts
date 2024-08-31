package day7;

import java.util.Scanner;

public class String_Left_Rotation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Stirng");
		String a=s.nextLine();
        int n=a.length();
        System.out.println("Enter no of left Rotation");
		int m=s.nextInt();
		if(m>n) m%=n;
		StringBuilder b=new StringBuilder(a);
		while(m>0) {
			char c=b.charAt(0);
			for(int i=1;i<n;i++) {
				char d=b.charAt(i);
				b.setCharAt((i-1),d );
			}
			b.setCharAt((n-1),c);
			m--;
		}
		
		System.out.println(b);
		s.close();
	}

}
