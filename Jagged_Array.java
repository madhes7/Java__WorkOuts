package day7;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		      int arr[][] = new int[3][];  
		      arr[0] = new int[10];  
		      arr[1] = new int[6];  
		      arr[2] = new int[2];  
		      //initializing a jagged array  
//		      int count = 0;  
		      for (int i=0; i<arr.length; i++)  {
		    	  System.out.println("Enter the elements of row "+(1+i)+" it can store "+arr[i].length);
		          for(int j=0; j<arr[i].length; j++)  
		              arr[i][j] = s.nextInt(); }
		 
		      //printing the data of a jagged array   
		      for (int i=0; i<arr.length; i++){  
		          for (int j=0; j<arr[i].length; j++){  
		              System.out.print(arr[i][j]+" ");  
		          }  
		          System.out.println();//new line  
		      }  
		  
s.close();
	}

}
