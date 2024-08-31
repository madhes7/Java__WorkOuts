/*2.Write a Java program to find the first non-repeating character in a string.
The given string is: gibblegabbler
The first non repeated character in String is: i*/

package day5;
//import java.util.*;

public class FirstnonnrepeatingString {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
        String a="gibblegabbalxeir";
        
        
        for(int i=0;i<a.length();i++) {
        	boolean f=false;
        	char c=a.charAt(i);
        	
        	for(int j=0;j<a.length();j++) {
        		char d=a.charAt(j);
        		if(i==j) {
        			continue;
        		}
        		if(c==d) {
        			f=true;

        			break;
        		}
        		
        	}
        	if(f==false) {
        		System.out.println(c);
        		break;
        	}
        	
        }
	}

}
