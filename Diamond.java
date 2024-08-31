package day3;
//import java.util.Scanner;
//
//public class Diamond {
//
//	public static void main(String[] args) {
//		
//		Scanner sc=new Scanner(System.in);
//		int i,j,n;
//		n=sc.nextInt();
//		for(i=0;i<n;i++) {
//			for(j=0;j<n;j++) {
//				if(j==(n/2) || i==(n/2)) {
//					System.out.print("# ");
//				}
//				else if(i!=0 && i!=n-1) {
//					if(j<(n/2)-i || j>(n/2)+1) {
//						System.out.print("# ");
//					}
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//	}
//
//}

import java.util.Scanner;
class Diamond{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n/2;
		int l=m,h=m,i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j>=l && j<=h) {
					System.out.print("# ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<m) {
				l--;
				h++;
			}
			else {
				l++;
				h--;
			}
			System.out.println();

		}
		
	}
}
