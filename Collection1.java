package day7;


import java.util.*;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add(100);
		list.add("Hi");
		list.add(12.24);
		list.add(true);
		list.add('A');
		
		
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		ListIterator lit=list.listIterator();
//		while(lit.hasPrevious()) {
//		System.out.println(lit.previous());
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
//		for(Object i:list) {
//			System.out.println(i);
//		}
		
//		list.forEach(l -> System.out.println(l));
		
//		list.add(2,"Java");
//		list.remove(2);
//		
//		list.forEach(System.out :: println);
		
		
	}

}
