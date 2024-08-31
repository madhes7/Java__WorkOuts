package day02;
import java.util.*;
public class countofprime {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of prime number  number");
		int a=s.nextInt();	
		int x=2;
		while(a>0) {
			int i=2;
			int temp=(x/2);
			int f=0;
			
				 while(i<=temp) {
			 
				if(x%i==0) {
					
					f++;
					break;
				}
			i++;}
			if(f==0) {
				System.out.print(x+" ");
				a--;
			}
	        x++;	
	}
		s.close();		

	}

}
