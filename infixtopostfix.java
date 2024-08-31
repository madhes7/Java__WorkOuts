package day7;

import java.util.*;

public class infixtopostfix {
        static int priority(char c) {
        	int n=0;
        	switch(c) {
        	case '$':
        	case '^':
        		n=4;
        		break;
        	case '*':
        	case '/':
        		n=3;
        		break;
        	case '+':
        	case '-':
        		n=2;
        		break;
        	case '=':
        	
        		n=1;
        		break;
        	case '(':
        	case ')':
        		n=0;
        	
        	}
        	return n;
        }
        
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		Stack<Character> b=new Stack<>();
		s.close();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(Character.isAlphabetic(c)||Character.isDigit(c)) {
				System.out.print(c+" ");
			}
			else  {
				if(c=='(') {
					 b.push(c);
				}
				else if (c == ')') {
	                    char d = ')';
	                    while (d!= '(') {
	                        d = b.pop();
	                        if(d!='('&&d!=')')
	                        System.out.print(d+" ");
	                    }}
	            else {
	                        int f=priority(b.peek());
	                        int se=priority(c);
	                        if(f<se)
	                            b.push(c);
	                        else{
	                            System.out.print(b.pop()+" ");
	                           b.push(c);

	                        }}
				
			}
			}
		
	}}
		
				
			
		

	
	
