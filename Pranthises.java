package day7;

import java.util.*;

public class Pranthises {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		Stack<Character> b=new Stack<>();
		for(int i=0;i<a.length();i++) {
		  char c=a.charAt(i);
		  if(c=='{'||c=='('||c=='[') {
			  b.push(c);
			 
		  }
		  
		  else if(c=='}'||c==')'||c==']') {
			  char d=b.pop();
			  if(d=='{'&& c=='}') {
				  System.out.println(d+" "+c);
			  }
			  else if(d=='(' && c==')') {
				  System.out.println(d+" "+c);
			  }
			  else if(d=='['&& c==']') {
				  System.out.println(d+" "+c);
			  }
			  else {
				  System.out.println("Not equal paranthisises"+d+""+c);
				  break;
			  }
			 
			  s.close();
		  }
		}

	}

}
