package infynd;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_list_group_reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> a=new LinkedList<>();
		
		for(int i=0;i<10;i++) {
			a.add(s.nextInt());
		}
     int x=s.nextInt();
     a.addFirst(x);
     s.close();
    System.out.print(a);
//    try
//    {int x[]=new int[0];
//    x[1]=0;}
//    catch(Exception e) {
//    	System.out.println(e);
//    }
//    System.out.print("ojhgfd");
	}

}
