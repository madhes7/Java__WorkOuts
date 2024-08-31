package infynd;

import java.util.Scanner;

public class Duplicate_Count_in_array {
	public static int Max(int[] b,int a) {
		int m=b[0];
		for(int i=1;i<a;i++) {
			if(m<b[i]) m=b[i];
		}
		return m;
	}
	

	public static void main(String[] args) {
     	Scanner s=new Scanner(System.in);
     	System.out.print("Enter the Number of elements in array");
		int a=s.nextInt();
		int b[]=new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<a;i++) {
			b[i]=s.nextInt();
		}
		s.close();
		int m=Max(b,a);
		int c[]=new int[m+1];
		for(int i=0;i<m;i++) {
			c[i]=0;
		}
		for(int i=0;i<a;i++) {
			int x=b[i];
			c[x]=c[x]+1;
		}
     for(int i=0;i<m;i++) {
    	 if(c[i]>1) {
    		 System.out.println(i+" Occured "+c[i]+" Times");
    	 }
     }
	}

}
