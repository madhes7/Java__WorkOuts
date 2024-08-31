package day7;
import java.util.*;
public class ArrayList_duplicate_remove {

	public static void main(String[] args) {
		
		        Collection<Integer> l=new ArrayList();
		        l.add(1);
		        l.add(10);
		        l.add(10);
		        l.add(1);
		        l.add(1);
		        System.out.println(l);
		        Collection<Integer> c=new HashSet(l);
		        Collection<Integer> p=new ArrayList(c);
		        System.out.println(p);
		    
		

	}

}
