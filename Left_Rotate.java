package day7;

import java.util.Scanner;

public class Left_Rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter no of left Rotation");
		int m=sc.nextInt();
		if(m>n) m%=n;
	    while(m>0) {
	    	int f=a[0];
	    	for(int i=1;i<n;i++) {
	    		a[i-1]=a[i];
	    	}
	    	a[n-1]=f;
	    	m--;
	    }
	    for(int x:a) {
	    	System.out.print(x+" ");
	    }
	    sc.close();
	}

}
