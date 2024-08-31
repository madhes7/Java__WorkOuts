package day3;
import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		int m=n/2;
		int l=0,h=n-1;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==l || j==h) {
					System.out.print("# ");
				}
				else if(i==m && j==m) {
					System.out.print("# ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			l++;h--;
			System.out.println();
		}
		sc.close();
	}

}
