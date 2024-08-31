package day3;
import java.util.Scanner;

public class For4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
