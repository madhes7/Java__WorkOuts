package day3;
import java.util.*;
public class Arrayprimenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the statting element of prime number");
		int x=sc.nextInt();
		System.out.println("Entre the count of prime number");
		int a=sc.nextInt();
		int aa[]=new int[a];
		int s=0;
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
				aa[s]=x;
				
				a--;
				
				s++;
			}
	        x++;	
	}
	for(int i:aa) {
		System.out.print(i+" ");
	}
sc.close();
	}

}
