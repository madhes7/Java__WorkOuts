package infynd;
import java.util.*;
public class Linked_list {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
    	
        LinkedList<Integer> list = new LinkedList<>();    	
        for(int i=0;i<n;i++) {
        	list.add(s.nextInt());
        }
         
        	
        	 int k = s.nextInt();
        	 s.close();
         LinkedList<Integer> lists=reverse(list,k);
         for(Integer num:lists) {
        	 System.out.print(num+"->");
         }
	}
         
         public static LinkedList<Integer> reverse(LinkedList<Integer> list,int k){
        	 LinkedList<Integer> result = new LinkedList<>();
        	 LinkedList<Integer> temp = new LinkedList<>();
        	 
        	 for(Integer num:list) {
        		 temp.addFirst(num);
        		 if(temp.size()==k) {
        			 result.addAll(temp);
        			 temp.clear();
        		 }
        	 }
        	 
        	 result.addAll(temp);
        	 return result;
        	 
         }

	
}