package day5;

import java.util.Scanner;

public class finalstringcheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a=s.nextLine();
		
        String b=s.nextLine();
        int a1=a.length();
        int b1=b.length();
        if((a.charAt(a1-1)==b.charAt(b1-1))&&(a.charAt(a1-2)==b.charAt(b1-2))) {
        	
        		System.out.println("They end with same ");
        	}
        	
        else {
        	System.out.println("They end with different ");
        }
        
        s.close();
	}

}
