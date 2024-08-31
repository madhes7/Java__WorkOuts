   package day7;

import java.util.Scanner;

public class String_Right_Rotation {

	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Stirng");
		String a=s.nextLine();
        int n=a.length();
        System.out.println("Enter no of Rigth Rotation");
		int m=s.nextInt();
		if(m>n) m%=n;
		StringBuilder b=new StringBuilder(a);
		while(m>0) {
			char c=b.charAt(n-1);
			for(int i=n-1;i>0;i--) {
				char d=b.charAt(i-1);
				b.setCharAt(i,d );
			}
			b.setCharAt(0,c);
			m--;
		}
		
		System.out.println(b);
		s.close();

	}

}
