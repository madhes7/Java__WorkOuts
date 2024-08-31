package day4;
import java.util.*;
public class Fibanociserise {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int f=a+b;
			System.out.print(f+" ");
			a=b;
			b=f;
			
		}
		
	s.close();	
	}

}
