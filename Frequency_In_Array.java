package day7;

import java.util.Scanner;

public class Frequency_In_Array {
     		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size of the Array");
			int n=sc.nextInt();
			int array[]=new int[n];
			int frequency[]=new int[n];
			System.out.println("Enter the Array Elements");
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
			}
			int visited=-1;
			System.out.println();
			for(int i=0;i<n;i++) {
				int count=1;
				for(int j=i+1;j<n;j++) {
					if(array[i]==array[j]) {count++;frequency[j]=visited;}
				}
				if(frequency[i]!=visited) {
					frequency[i]=count;
				}
			}
			for(int i=0;i<n;i++) {
				if(frequency[i]!=visited) {System.out.println(array[i]+" = "+frequency[i]+" Times");
				}
			}
			sc.close();
		}

	}