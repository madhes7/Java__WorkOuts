package infynd;

//import java.util.Arrays;
import java.util.Scanner;

public class Minimmum_of_two_elements_in_a_Array {

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
		int min=10;
		int i1=0;
		int j1=0;
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				int x=b[i]-b[j];
				if(min<x ) {
					min=x;
					i1=i;
					j1=j;
				}
			}
		}
//		Arrays.sort(b);
//		min=b[j1]-b[i1];
		System.out.println("Output : "+min);
		System.out.println("The Maximum difference is between : "+b[i1]+" "+b[j1]);
	}

}
