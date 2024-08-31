package day7;

import java.util.Scanner;


public class Magic_matrix {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int arr[][]=new int[a][a];
				int previ=0;
				int prevj=(a/2);
				arr[previ][prevj]=1;
				for(int i=2;i<=(a*a);i++) {
					if(previ==0)
						previ=a-1;
					else
						previ--;
					if(prevj==a-1)
						prevj=0;
					else prevj++;
					if(arr[previ][prevj]==0) 
					{
						arr[previ][prevj]=i;
					}
					else {
						if(previ==a-1)
							previ=1;
						else
							previ+=2;
						if(prevj==0)
							prevj=a-1;
						else
						    prevj-=1;
						arr[previ][prevj]=i;
					}
				}
				for(int i=0;i<a;i++) {
					for(int j=0;j<a;j++) {
						System.out.printf("%02d ",arr[i][j]);
					}System.out.println();
				}
			
 	sc.close();
		}

}
