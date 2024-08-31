package day3;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
