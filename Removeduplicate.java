/*3.Write a Java program to print the result of removing dupluplicate given string.
The given string is: w3resource
After removing duplicate characters the  string is w3resouc*/

package day5;

public class Removeduplicate {

	public static void main(String[] args) {
		String a="w3resource";
		StringBuilder b=new StringBuilder(a);
		StringBuilder c1=new StringBuilder();
		for(int i=0;i<b.length();i++) {
           char c=b.charAt(i);
        	
        	for(int j=0;j<b.length();j++) {
        		char d=b.charAt(j);
        		if(i==j) {
        			continue;
        		}
        		if(c==d) {
        			 
                   b.setCharAt(j, '#');
        			break;
        		}
		}}
        	for(int i=0;i<b.length();i++) {
        		if(b.charAt(i)!='#') {
        			c1.append(b.charAt(i));
        		}
        	}

	
System.out.print(c1);
}
		
	}
