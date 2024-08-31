package day02;
import java.util.*;
public class loop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Ending number");
		int a=s.nextInt();
		int i=0;
		System.out.println("The whole number are");
		while(i<=a) {
			System.out.print(i+" ");
			i++;
		}
		s.close();

	}

}
