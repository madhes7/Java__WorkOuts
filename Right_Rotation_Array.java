package day7;

import java.util.Scanner;

public class Right_Rotation_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of Array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter no of Right Rotation");
		int m=sc.nextInt();
		if(m>n) m%=n;
	    while(m>0) {
	    	int f=a[n-1];
	    	for(int i=n-1;i>0;i--) {
	    		a[i]=a[i-1];
	    	}
	    	a[0]=f;
	    	m--;
	    }
	    for(int x:a) {
	    	System.out.print(x+" ");
	    }
	    sc.close();

	}

}
