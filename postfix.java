package day7;

import java.util.Scanner;
import java.util.Stack;
public class postfix {
	public static void main(String args[]) {
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int n=str.length();
		String s="";
		for(int i=0;i<n;i++) {
			char c=str.charAt(i);
			if(c==' ') {
				if(s.equals("+")) {
					int a=st.pop();
					int b=st.pop();
					st.push((b+a));
					s="";
				}
				else if(s.equals("-")) {
					int a=st.pop();
					int b=st.pop();
					st.push((b-a));
					s="";
				}
				else if(s.equals("/")) {
					int a=st.pop();
					int b=st.pop();
					st.push((b/a));
					s="";
				}
				else if(s.equals("*")) {
					int a=st.pop();
					int b=st.pop();
					st.push((b*a));
					s="";
				}
				else {
					st.push(Integer.parseInt(s));
					s="";
				}
			}
			else {
				s+=c;
			}
		}
		if(s.equals("+")) {
			int a=st.pop();
			int b=st.pop();
			st.push((b+a));
			s="";
		}
		else if(s.equals("-")) {
			int a=st.pop();
			int b=st.pop();
			st.push((b-a));
			s="";
		}
		else if(s.equals("/")) {
			int a=st.pop();
			int b=st.pop();
			st.push((b/a));
			s="";
		}
		else if(s.equals("*")) {
			int a=st.pop();
			int b=st.pop();
			st.push((b*a));
			s="";
		}
		else {
			st.push(Integer.parseInt(s));
			s="";
		}
		
		System.out.println(st.pop());
	} 
}