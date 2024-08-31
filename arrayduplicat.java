package day3;

import java.util.Arrays;

public class arrayduplicat {
	public static void main(String as[]) {
		
		int  a[]= {10,20,20,30,80,40,50,70,100,36,21,40,50,10,30,20};
		
		int n=a.length;
		int b[]=new int[n];
		int z=0,f=0;
		 b[0]=a[0];
		 z++;
		for(int i=1;i<n;i++) {
			int x=a[i];
			f=0;
			for(int j=0;j<b.length;j++) {
				int y=b[j];
				if(x==y) {
					f++;
				}
			}
			if(f==0) {
				b[z]=a[i];
				z++;
			}
				
		}
		Arrays.sort(b);
	for(int i=0;i<z;i++) {
		if(b[i]!=0) {
		System.out.print(b[i]+" ");
	}
		else {
			z++;
		}}
		
//		for(int i=0;i<n;i++) {
//			boolean d=true;
//			for(int j=0;j<n;j++) {
//				if(i!=j) {
//					if(a[i]==a[j]) {
//						d=false;
//					}
//				}
//				
//			}
//			if(d==true) {
//				System.out.print(a[i]+" ");
//			}
//		}
}}
